package com.ufes.withSRP;

import java.time.LocalDate;

/**
 *
 * @author maycon
 */
class Professor {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String matricula;

    public Professor(String nome, String cpf, LocalDate dataNascimento, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString(){
        String prof = "";
        prof += "Nome :" + getNome() + "\n";
        prof += "CPF :" + getCpf() + "\n";
        prof += "Matricula :" + getMatricula() + "\n";
        prof += "Data de Nascimento :" + getDataNascimento() + "\n";
        
        return prof;
    }
    
}
