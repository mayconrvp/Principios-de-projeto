package com.ufes.withoutISP;

/**
 *
 * @author maycon
 */
public class Passaro implements IAnimal {
    @Override
    public void voar() {
        System.out.println("Passaro voando");
    }

    @Override
    public void mover() {
        System.out.println("Passaro se movendo");
    }
    
    @Override
    public void correr() {
    }
}
