package com.ufes.withoutISP;

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
        cao.voar(); //Mas cão não voa!!
        
        passaro.correr(); //E pássaro não corre!!
        passaro.mover();
        passaro.voar(); 
        
    }
    
}
