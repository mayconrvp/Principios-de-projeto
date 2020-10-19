/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.withoutDRY;

/**
 *
 * @author maycon
 */
public class Instrumento {
    private String nome;
    private String timbre;

    public Instrumento(String nome) {
        this.nome = nome;
    }

    public String tocar(){
        if(this.nome == "Violão"){
            return timbre = "Timbre do(a) " + getNome()+ ": vream";
        }else if(this.nome == "Guitarra"){
            return timbre = "Timbre do(a) " + getNome()+": gream";
        }else if (this.nome == "Baixo"){
            return timbre = "Timbre do(a) " + getNome()+": dum";
        }else{
            return "";
        }
    }
    
    public String getNome() {
        return nome;
    }

    public String getTimbre() {
        return timbre;
    }
    
    
}
