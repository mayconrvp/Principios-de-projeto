package com.ufes.withoutLSP;

/**
 *
 * @author maycon
 */
public class Teste {
    public static void main(String[] args) {
        
        Violao violao = new Violao();
        Guitarra guitarra = new Guitarra();
        
        System.out.println(violao.tocar());
        System.out.println(guitarra.tocar()+ "\n");
        
        //Se eu adotar que guitarra é um tipo de violão, o LSP é ferido ao tentar substituir um violão por uma guitarra:
        
        Violao guitar = new Guitarra();
        
        System.out.println(guitar.tocar());
        System.out.println(guitar.tocar());
        
        
    }
}
