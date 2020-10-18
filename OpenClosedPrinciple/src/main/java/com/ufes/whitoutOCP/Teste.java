package com.ufes.whitoutOCP;

/**
 *
 * @author maycon
 */
public class Teste {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("José da Silva", 5500.80, "Gerente de Projetos");
        Funcionario funcionario2 = new Funcionario("Luana Vieira", 3000.55, "Programadora");
        
        Bonus calc = new Bonus();
        
        double b1 = calc.CalculaBonusPorCargo(funcionario1.getCargo());
        //System.out.println(calc.getBonus());
        funcionario1.setSalarioTotal(b1);
        
       
        double b2 = calc.CalculaBonusPorCargo(funcionario2.getCargo());
        //System.out.println(calc.getBonus());
        funcionario2.setSalarioTotal(b2);
        
        System.out.println(funcionario1.toString() + "\n");
        System.out.println(funcionario2.toString());
    }
}
