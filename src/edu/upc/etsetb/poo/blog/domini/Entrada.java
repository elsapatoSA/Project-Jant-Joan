
package edu.upc.etsetb.poo.blog.domini;

public class Entrada {

    private static int nEntrades=0;
    private int id;
    private String text, titol;
    private Temps temps;
    //Constructor
    public Entrada(String titol,String text,String temps){
        this.titol=titol;
        this.text=text;
        nEntrades++;
        this.id=nEntrades;
        Temps aquest=new Temps(temps);
        if (temps.equals(""))
            this.temps.ara();
        else
            this.temps=aquest;
    }

    public int getId(){
        return(this.id);
    }

    public String getTitol(){
        return(this.titol);
    }

    public Temps getQuan(){
        return(this.temps);
    }

    public static int compare(Entrada una, Entrada altra, String criteri){
        switch (criteri) {
            case "num":
                if (una.id>=altra.id)
                    return(1);
                else
                    return(-1);
            case "titol":
                if (una.titol.compareTo(altra.titol)>=0)
                    return(1);
                else
                    return(-1);
            default:
                return(0);
        }
        }
    @Override
    public String toString(){
        String string= +this.id+" "+this.titol+" "+this.text+" "+this.temps.dia+" "+this.temps.hora;
        return(string);
    }
            
    }



















    
