/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.blog.domini;

public class Temps {
    String dia, hora;

    // Constructors:
    public Temps(){
        this.dia="";
        this.hora="";                
    }
    public Temps(String temps){
        String constr[];
        constr = temps.split(" ");  
        this.dia=constr[0];
        this.hora=constr[1];
    }
}
