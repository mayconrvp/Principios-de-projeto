/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.whitoutOCP;

/**
 *
 * @author maycon
 */
public class Bonus {
    private double bonus;    
    
    public Bonus() {
    }
    
    public double CalculaBonusPorCargo(String cargo){
        if (cargo.equals("Programador") || cargo.equals("Programadora")){
            setBonus(350.45);
        }else if(cargo.equals("Gerente de Projetos")){
            setBonus(900.20);
        }
        return bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
