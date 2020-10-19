/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withLOD;

import java.util.ArrayList;

/**
 *
 * @author maycon
 */
public class Teste {
    public static void main(String[] args) {
        Produto produto1 = new Produto ("Caixa Organizadora", 7.50);
        Produto produto2 = new Produto ("Kit de Copos", 30.99);
        
        Item it1 = new Item(produto1, 5);
        Item it2 = new Item(produto2, 2);
        
        ArrayList <Item> itens = new ArrayList<>();
        itens.add(it1);
        itens.add(it2);
        
        CarrinhoDeCompras cart = new CarrinhoDeCompras("João", itens);
        
        System.out.println("Valor total do carrinho: "+cart.valorTotalDeItens());
    }
}
