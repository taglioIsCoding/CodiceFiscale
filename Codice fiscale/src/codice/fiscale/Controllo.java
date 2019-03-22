/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codice.fiscale;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gianni
 */
public class Controllo {
    private String codice="";
    
    public Controllo(String codice)
    {
        this.codice=codice;
    }

    public void setCodice(String codice)
    {
        this.codice = codice;
    }

    public String getCodice() 
    {
        return codice;
    }
    
    public String carattere() throws FileNotFoundException
    {
        //variabili
        String par="";
        String dis="";
        String pronto="";
        int n=0;
        int m=0;
        int codp=0;
        int codd=0;
        int res=0;
       
        //assegno pari e dispari
       String pari="";
       pari=pari+codice.charAt(1)+codice.charAt(3)+codice.charAt(5)+codice.charAt(7)+codice.charAt(9)+codice.charAt(11)+codice.charAt(13);
       String dispari="";
       dispari=dispari+codice.charAt(0)+codice.charAt(2)+codice.charAt(4)+codice.charAt(6)+codice.charAt(8)+codice.charAt(10)+codice.charAt(12)+codice.charAt(14);
       
       
       
       
       //calcolo pari
       for (int i=0; i<pari.length();i++)
       {
       File file1 = new File ("C:\\Users\\72873486\\Downloads\\pari.txt");
       Scanner c = new Scanner (file1);
        while (c.hasNextLine())
        {
         par = c.nextLine();
         String p=par.substring(0, 1);
         String d=""+pari.charAt(i);
         
         if(p.equals(d))
         {
          n=Integer.parseInt(par.substring(2));
          codp=codp+n;
          break;
         }
        }   
       }
       
       //calcolo dispari
        
       for (int j=0; j<pari.length()+1;j++)
       {
       File file2 = new File ("C:\\Users\\72873486\\Downloads\\dispari.txt");
       Scanner v = new Scanner (file2);
        while (v.hasNextLine())
        {
         dis = v.nextLine();
         String w=dis.substring(0, 1);
         String z=""+dispari.charAt(j);
         
         if(w.equals(z))
         {
          m=Integer.parseInt(dis.substring(2));
          codd=codd+m;
          break;
         }
        }   
       }
         
        
      
        res=(codp+codd)%26;        

        
       //sostituzione cifra in lettera 
       File file3 = new File ("C:\\Users\\72873486\\Downloads\\controllo.txt");
       Scanner d = new Scanner (file3);
        while (d.hasNextLine())
        {
         String f= d.nextLine();
         String codf= String.valueOf(res);
         if(codf.equals(f.substring(0, 2)))
         {
          pronto=pronto+f.substring(3);
          break;
         }
        }  
     return pronto;
       
    }
    
}
