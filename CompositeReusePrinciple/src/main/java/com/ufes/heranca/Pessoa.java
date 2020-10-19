package com.ufes.heranca;

import java.time.LocalDate;

/**
 *
 * @author maycon
 */
public class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
    protected String cpf;
    protected char sexo;
    protected String tipoSanguineo;

    public Pessoa(String nome, LocalDate dataNascimento, String cpf, char sexo, String tipoSanguineo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
        this.tipoSanguineo = tipoSanguineo;
    }

    public String andar(){
        return getNome() + " está andando";
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
    
}
