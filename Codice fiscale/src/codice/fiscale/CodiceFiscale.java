/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codice.fiscale;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author 72873486
 */
public class CodiceFiscale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader tastiera = new BufferedReader (input);
        Scanner s = new Scanner (System.in);
        
        //dichiaro variabili
        int v1[];
        int v2[];
        String nome=null;
        String cognome=null;
        String codiceFiscale="";
        int giornoI;
        String giorno="";
        int meseI;
        String mese="";
        int annoI;
        String anno="";
        int sesso;
        String citta="";
        String cod="";
        String c="";
    
        //input nome e cognome
        System.out.println("Inserisci il cognome");
        try
        {
            cognome = tastiera.readLine();
        }catch (Exception e) {}
        
        System.out.println("Inserisci il nome");
        try
        {
            nome = tastiera.readLine();
        }catch (Exception e) {}
        
        
        //input data di nascita
        do
        {
        System.out.println("inserisci il tuo giorno di nascita");
        giornoI = s.nextInt();   
        }while (giornoI < 0 || giornoI > 31);
        
        do
        {
        System.out.println("inserisci il tuo mese di nascita \n 1: Gennaio \n 2: Febbraio \n 3: Marzo \n 4: Aprile \n 5: Maggio \n 6: Giugno \n 7: Luglio \n 8: Agosto \n 9: Settembre \n 10: Ottobre \n 11: Novembre \n 12: Dicembre");
        meseI = s.nextInt();   
        }while (meseI < 0 || meseI > 12);
        
        do
        {
        System.out.println("inserisci il tuo anno di nascita");
        annoI = s.nextInt();   
        }while (annoI < 1000);
        
        //input sesso
        do
        {
        System.out.println("inserisci il tuo sesso \n 1:maschio \n 2:femmina");
        sesso = s.nextInt();   
        }while (sesso !=1 && sesso !=2);
        
        //input citta di nascita
        System.out.println("inserisci il tuo luogo di nascita");
        String citt=s.next();
        
       
                        
        
        //ottimmizzo le stringhe
        cognome=cognome.toUpperCase();
        nome=nome.toUpperCase();
        cognome=cognome.trim();
        cognome=cognome.replaceAll(" ", "");
        nome=nome.trim();
        nome=nome.replaceAll(" ", "");
        anno= String.valueOf(annoI);
        mese= String.valueOf(meseI);
        giorno= String.valueOf(giornoI);
        citt=citt.toUpperCase();
        
        //creazioni oggetti
        NomeCognome cogtot = new NomeCognome(nome, cognome);
        NomeCognome nomtot = new NomeCognome(nome, cognome); 
        Data datatot = new Data (giorno , mese , anno , sesso);
        
        //codice per catastale
        File file = new File ("C:\\Users\\72873486\\Downloads\\codice.txt");
        Scanner t = new Scanner (file);
        while(true)
        {
            citta=t.nextLine();
            if (citta==null)
            {
              break;   
            }
            else if (citta.length()>3)
            {
            c=citta.substring(5 , citta.length()-3);
            if (c.equals(citt))
            {
              cod=citta.substring(0,4);
              break;  
            }      
            }       
        }
        
          
       //utilizzo metodi
       codiceFiscale=cogtot.cPronto(cognome);
       codiceFiscale=codiceFiscale+nomtot.nPronto(nome);
       codiceFiscale=codiceFiscale+datatot.aPronto();
       codiceFiscale=codiceFiscale+datatot.mPronto(meseI);
       codiceFiscale=codiceFiscale+datatot.gPronto(giornoI);
       codiceFiscale=codiceFiscale+cod;
       
       //carattere di controllo
       Controllo controllotot = new Controllo(codiceFiscale);
       codiceFiscale=codiceFiscale+controllotot.carattere();
       
       
       
       
       System.out.println(codiceFiscale);
       
        
    }
    
}
