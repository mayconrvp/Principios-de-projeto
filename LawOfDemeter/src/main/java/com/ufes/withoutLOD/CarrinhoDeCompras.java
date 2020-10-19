/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.withoutLOD;

import java.util.ArrayList;



/**
 *
 * @author maycon
 */
public class CarrinhoDeCompras {
    private String dono;
    private ArrayList<Item> itens;

    public CarrinhoDeCompras(String dono, ArrayList<Item> itens) {
        this.dono = dono;
        this.itens = itens;
    }

    public double valorTotalDeItens(){
        double total = 0;
        for (Item item : itens){
            total += item.getProduto().getValor() * item.getQuantidade();//quebra a lei aqui
        }
        return total;   
    }
}
