package com.ufes.composicao;

import java.util.ArrayList;


public class Equipe {
    private String nome;
    private String descricao;
    private ArrayList <Funcionario> funcionario = new ArrayList();
    private Chefe chefe;

    public Equipe(String nome, String descricao, Chefe chefe) {
        this.nome = nome;
        this.descricao = descricao;
        this.chefe = chefe;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Chefe getChefe() {
        return chefe;
    }

    public ArrayList<Funcionario> getFuncionariro() {
        return funcionario;
    }

    public void setFuncionariro(ArrayList<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Equipe - " 
                + "Nome: " + nome 
                + "\nDescricao: " + descricao 
                + "\nFuncionarios: " + funcionario 
                + "\nChefe: " + chefe;
    }
        
}
