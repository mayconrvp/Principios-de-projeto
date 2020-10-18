/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.withOCP;

/**
 *
 * @author maycon
 */
public class BonusGerente extends BonusPorCargo{
    
    private double bonus;
    
    @Override
    public double calculaBonus(String cargo) {
        if (cargo.equals("Gerente de Projetos")){
            setBonus(350.45);
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
