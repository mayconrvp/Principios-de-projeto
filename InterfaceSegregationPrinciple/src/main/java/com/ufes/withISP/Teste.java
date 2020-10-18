/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.withISP;

/**
 *
 * @author maycon
 */
public class Teste {
    public static void main(String[] args) {
        Cao cao = new Cao();
        Passaro passaro = new Passaro();
        
        cao.correr();
        cao.mover();
        
        passaro.mover();
        passaro.voar();
        
    }
}
