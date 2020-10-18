/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.withoutISP;

/**
 *
 * @author maycon
 */
public class Cao implements IAnimal {
    private String raca;

    @Override
    public void voar() {
    }

    @Override
    public void correr() {
        System.out.println("Cachorro correndo");
    }

    @Override
    public void mover() {
        System.out.println("Cachorro se movendo");
    }
    
    
}
