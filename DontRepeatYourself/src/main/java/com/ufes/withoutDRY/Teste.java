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
public class Teste {
    public static void main(String[] args) {
        
        //exemplo 1
        Viagem v1 = new Viagem("Salvador - BA", "Vitória da Conquista - BA");
        Viagem v2 = new Viagem("Macaé - RJ", "Cachoeiro de Itapemirim - ES");
        
        System.out.println(v1.viajarAvião());
        System.out.println(v2.viajarOnibus());
        System.out.println("");

        //exemplo 2
        
        Instrumento instrumento1 = new Instrumento("Violão");
        Instrumento instrumento2 = new Instrumento("Baixo");
        System.out.println(instrumento1.tocar());
        System.out.println(instrumento2.tocar());
    }
}
