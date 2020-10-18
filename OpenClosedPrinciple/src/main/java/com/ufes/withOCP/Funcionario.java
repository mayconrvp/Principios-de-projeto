package com.ufes.withOCP;

/**
 *
 * @author maycon
 */
public class Funcionario {
    private String nome;
    private double salarioBase;
    private double salarioTotal;
    private String cargo;
    private com.ufes.whitoutOCP.Bonus bonus;

    public Funcionario(String nome, double salarioBase, String cargo) {
        setNome(nome);
        setSalarioBase(salarioBase);
        setCargo(cargo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public com.ufes.whitoutOCP.Bonus getBonus() {
        return bonus;
    }

    public void setBonus(com.ufes.whitoutOCP.Bonus bonus) {
        this.bonus = bonus;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double bonus) {
        this.salarioTotal = getSalarioBase() + bonus;
    }

    @Override
    public String toString() {
        String func = "";
        func += "Funcionário: " + getNome() + "\n";
        func += "Salário: R$" + getSalarioBase() + "\n";
        func += "Salário Total: R$" + getSalarioTotal() + "\n";
        func += "Cargo: " + getCargo() + "\n";
        return func;
    }
    
}
