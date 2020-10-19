package com.ufes.heranca;

import java.time.LocalDate;


public class Funcionario extends Pessoa {
    private String codigo;
    private String cargo;
    private double salario;

    public Funcionario(String codigo, String cargo, double salario, String nome, LocalDate dataNascimento, String cpf, char sexo, String tipoSanguineo) {
        super(nome, dataNascimento, cpf, sexo, tipoSanguineo);
        this.codigo = codigo;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String trabalhar(){
        return getNome() + " está trabalhando";
    }
       
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Funcionario: " + getNome()+
                "\nCodigo: " + codigo + 
                "\nCargo: " + cargo + 
                "\nSalario: " + salario;
    }
    
    
    
}
