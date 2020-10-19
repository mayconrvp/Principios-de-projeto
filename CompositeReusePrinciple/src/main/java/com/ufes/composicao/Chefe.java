package com.ufes.composicao;

import java.time.LocalDate;

/**
 *
 * @author maycon
 */
public class Chefe {
    private String nome;
    private LocalDate dataNascimento;
    private String cargo;

    public Chefe(String nome, LocalDate dataNascimento, String cargo) {
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
    
    
}
