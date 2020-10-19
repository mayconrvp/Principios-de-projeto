package com.ufes.composicao;

import java.time.LocalDate;


public class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private String cargo;

    public Funcionario(String nome, LocalDate dataNascimento, String cargo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "\n     -" + nome 
                + " - DataNascimento: " + dataNascimento 
                + " - Cargo: " + cargo;
    }

    
    
}
