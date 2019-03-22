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
public class Data {
    private String giorno;
    private String mese;
    private String anno;
    private int sesso;
    
    public Data(String giorno, String mese, String anno, int sesso)
    {
        this.giorno=giorno;
        this.mese=mese;
        this.anno=anno;
        this.sesso=sesso;
    }
    
    public void setGiorno(String giorno)
    {
        this.giorno=giorno;
    }
    
    public String getGiorno()
    {
        return giorno;
    }
    
    public void setMese(String mese)
    {
        this.mese=mese;
    }
    
    public String getMese()
    {
        return mese;
    }
    
    public void setAnno(String anno)
    {
        this.anno=anno;
    }
    
    public String getAnno()
    {
        return anno;
    }
    
    public void setSesso(int sesso)
    {
        this.sesso=sesso;
    }
    
    public int getSesso()
    {
        return sesso;
    }
    
    public String gPronto (int giornoI)
    {
        String pronto="";
        switch (this.sesso)
        {
            case 1:
            {
             if (giornoI<=9)
            {
                this.giorno="0"+this.giorno;   
            }
              pronto=this.giorno;
            }break;  
              
            case 2:
            {
             giornoI=giornoI+40;
             pronto= String.valueOf(giornoI); 
             break;   
            }
        default: break;
              
        }
      System.out.println(pronto);
      return pronto;
    }
    
    public String aPronto()
    {
        String annoP = anno.substring(anno.length()-2); 
        return annoP;
    }
    
    public String mPronto(int meseI)
    {
        switch (meseI)
        {
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
                return "C";
            case 4:
                return "D";
            case 5:
                return "E";
            case 6:
                return "H";
            case 7:
                return "L";
            case 8:
                return "M";
            case 9:
                return "P";
            case 10:
                return "R";
            case 11:
                return "S";
            case 12:
                return "T";
            default: break;    
        }
           return "";     
    }
}
    
   
