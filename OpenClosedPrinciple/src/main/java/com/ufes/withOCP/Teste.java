package com.ufes.withOCP;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Ana Paula Souza", 5500.80, "Gerente de Projetos");
        Funcionario funcionario2 = new Funcionario("João Pedro da Silva", 3000.55, "Programador");
        
        BonusGerente cbGerente = new BonusGerente();
        BonusDev cbDev = new BonusDev();
        
        double b1 = cbGerente.calculaBonus(funcionario1.getCargo());
        double b2 = cbDev.calculaBonus(funcionario2.getCargo());
        
        funcionario1.setSalarioTotal(b1);
        funcionario2.setSalarioTotal(b2);
        
        System.out.println(funcionario1.toString() + "\n");
        System.out.println(funcionario2.toString());
    }
}
