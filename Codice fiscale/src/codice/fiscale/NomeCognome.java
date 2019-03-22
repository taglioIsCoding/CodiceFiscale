/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codice.fiscale;

/**
 *
 * @author 72873486
 */
public class NomeCognome {
    private String nome;
    private String cognome;
    
    public NomeCognome (String nome, String Cognome)
    {
        this.nome=nome;
        this.cognome=cognome;
    }
    
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setCognome(String cognome)
    {
        this.cognome=cognome;
    }
    
    public String getCognome()
    {
        return cognome;
    }
    
    
    //COGNOME
    public String cPronto(String cognome)
    {
     String pronto="";
     int j=0;
     
     //consonanti
     for (int i=0; i<cognome.length()-1; i++)
     {
       if (cognome.charAt(i)!='A'&&cognome.charAt(i)!='E'&&cognome.charAt(i)!='I'&&cognome.charAt(i)!='O'&&cognome.charAt(i)!='U')
       {
           pronto=pronto+cognome.charAt(i);
           j++;
       }
       
       if (j==3)
           i=cognome.length()+1;
     }
     //vocali
     if (j<3)
     {
     for (int k=0; k<cognome.length(); k++)
     {
       if (cognome.charAt(k)=='A'||cognome.charAt(k)=='E'||cognome.charAt(k)=='I'||cognome.charAt(k)=='O'||cognome.charAt(k)=='U')
       {
           pronto=pronto+cognome.charAt(k);
           j++;
       }
       if (j==3)
           k=cognome.length()+1;
     }
     }
     //x
     if (j<3)
     {
     for (int k=0; k<cognome.length(); k++)
     {
       pronto=pronto+'X';
       j++;
       if (j==3)
           k=cognome.length()+1;
     }
     }
     return pronto;   
     }
    
    
    
    
    //NOME
     public String nPronto(String nome)
     {
     String pronto="";
     int j=0;
     int conta=0;
     String p="";
     
     //conta
     for (int i=0; i<nome.length()-1; i++)
     {
       if (nome.charAt(i)!='A'&&nome.charAt(i)!='E'&&nome.charAt(i)!='I'&&nome.charAt(i)!='O'&&nome.charAt(i)!='U')
       {
         conta++;
       }
     }
     
     //consonanti+4
     if (conta>=4)
     {
     for (int i=0; i<nome.length(); i++)
     {
       if (nome.charAt(i)!='A'&&nome.charAt(i)!='E'&&nome.charAt(i)!='I'&&nome.charAt(i)!='O'&&nome.charAt(i)!='U')
       {
       
           pronto=pronto+nome.charAt(i);
           j++;
       }
   
     }
     pronto=""+pronto.charAt(0)+pronto.charAt(2)+pronto.charAt(3);
     }
     
     
     //consonanti-4
     if (conta<4)
     {
     //consonanti
      for (int i=0; i<nome.length(); i++)
     {
       if (nome.charAt(i)!='A'&&nome.charAt(i)!='E'&&nome.charAt(i)!='I'&&nome.charAt(i)!='O'&&nome.charAt(i)!='U')
       {
           pronto=pronto+nome.charAt(i);
           j++;
       }
       
       if (j==3)
       {
           i=nome.length()+1;
       }
           
     }
     //vocali
     if (j<3)
     {
     for (int k=0; k<nome.length(); k++)
     {
       if (nome.charAt(k)=='A'||nome.charAt(k)=='E'||nome.charAt(k)=='I'||nome.charAt(k)=='O'||nome.charAt(k)=='U')
       {
           pronto=pronto+nome.charAt(k);
           j++;
       }
       if (j==3)
       {
          k=nome.length()+1; 
       }
           
     }
     }
     //x
     if (j<3)
     {
     for (int k=0; k<nome.length(); k++)
     {
       pronto=pronto+'X';
       j++;
       if (j==3)
           k=nome.length()+1;
     }
     }
     
     }
     
     return pronto;  
     }
}    
