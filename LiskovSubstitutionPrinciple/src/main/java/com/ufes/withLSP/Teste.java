package com.ufes.withLSP;

/**
 *
 * @author maycon
 */
public class Teste{
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();
        Violao violao = new Violao();
        
        System.out.println(guitarra.tocar());
        System.out.println(violao.tocar()+"\n");
        
        //guitarra.setTimbre("RHUAMMM");
        //System.out.println(guitarra.tocar());
        
        Instrumento inst1 = new Guitarra();
        Instrumento inst2 = new Violao();
        System.out.println(inst1.tocar());
        System.out.println(inst2.tocar());
    }
}