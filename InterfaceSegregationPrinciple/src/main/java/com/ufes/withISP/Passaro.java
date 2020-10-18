package com.ufes.withISP;

/**
 *
 * @author maycon
 */
public class Passaro implements IAnimalAereo {
    
    @Override
    public void voar(){
        System.out.println("Passaro voando!");
    }
    
    @Override
    public void mover(){
        System.out.println("Passaro movendo-se voando ou andando");
    }
}
