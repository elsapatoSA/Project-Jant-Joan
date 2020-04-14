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
}
