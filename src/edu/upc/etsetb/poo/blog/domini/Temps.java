/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.blog.domini;

import java.time.LocalDateTime;

public class Temps {
    String dia, hora;

    // Constructors:
    public Temps(){
        this.dia="";
        this.hora="";                
    }
    public Temps(String temps){
        String separat[];
        separat = temps.split(" ");  
        this.dia=separat[0];
        this.hora=separat[1];
    }
    
    //Altres mètodes:
    public void ara(){
        String temps=LocalDateTime.now().toString(),separat[];
        separat=temps.split("T");
        this.dia=separat[0];
        this.hora=separat[1];
    }
    public int comparaDia(Temps altre){
        String parts[]=altre.dia.split("-"), parts_this[]=this.dia.split("-");
        int any=Integer.parseInt(parts[0]), mes=Integer.parseInt(parts[1]), dia=Integer.parseInt(parts[0]);
        int any_this=Integer.parseInt(parts_this[0]), mes_this=Integer.parseInt(parts_this[1]), dia_this=Integer.parseInt(parts_this[0]);
        if(any_this>any || any_this==any && mes_this>mes || any_this==any && mes_this==mes && dia_this>dia)
            return(1);
        else if (any_this<any || any_this==any && mes_this<mes || any_this==any && mes_this==mes && dia_this<dia)
            return(-1);
        else
            return(0);
        
    }
    
    public int comparaTemps(Temps altre){
        String parts[]=altre.dia.split("-"), parts_this[]=this.dia.split("-");
        String h[]=altre.hora.split("-"), h_this[]=this.hora.split("-");
        
        int any=Integer.parseInt(parts[0]), mes=Integer.parseInt(parts[1]), dia=Integer.parseInt(parts[0]);
        int any_this=Integer.parseInt(parts_this[0]), mes_this=Integer.parseInt(parts_this[1]), dia_this=Integer.parseInt(parts_this[0]);
        
        int hora=Integer.parseInt(parts_this[1]), minut=Integer.parseInt(parts_this[1]), segon=Integer.parseInt(parts_this[0]);
        int hora_this=Integer.parseInt(parts_this[1]), minut_this=Integer.parseInt(parts_this[1]), segon_this=Integer.parseInt(parts_this[0]);

        if(any_this>any || any_this==any && mes_this>mes || any_this==any && mes_this==mes && dia_this>dia)
            return(1);
        else if (any_this<any || any_this==any && mes_this<mes || any_this==any && mes_this==mes && dia_this<dia)
            return(-1);
        else if (any_this<any || any_this==any && mes_this<mes || any_this==any && mes_this==mes && dia_this==dia)
        {
            if (hora_this>any || hora_this==hora && minut_this>minut || hora_this==hora && minut_this==minut && segon_this>segon)
            return(1);
            else if (hora_this<any || hora_this==hora && minut_this<minut || hora_this==hora && minut_this==minut && segon_this<segon)
           return(-1);
            else if (hora_this<any || hora_this==hora && minut_this<minut || hora_this==hora && minut_this==minut && segon_this==segon)
           return(0);
       
        }return 0;

    
}   
    @Override
    public java.lang.String toString()
    {
       System.out.println("Dia: "+Temps.this.dia+" Hora: "+Temps.this.hora);
    




    return null;
    }
}
