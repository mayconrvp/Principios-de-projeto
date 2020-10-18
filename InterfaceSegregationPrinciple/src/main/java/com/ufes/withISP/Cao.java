package com.ufes.withISP;

/**
 *
 * @author maycon
 */
public class Cao implements IAnimalTerrestre{
    @Override
    public void correr(){
        System.out.println("Cachorro correndo!");
    }
    
    @Override
    public void mover(){
        System.out.println("Cachorro movendo-se andando ou correndo");
    }
}
