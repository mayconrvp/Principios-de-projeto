package com.ufes.withOCP;

/**
 *
 * @author maycon
 */
public class BonusDev extends BonusPorCargo{
    
    private double bonus =0;
 
    @Override
    public double calculaBonus(String cargo) {
        if (cargo.equals("Programador") || cargo.equals("Programadora")){
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
