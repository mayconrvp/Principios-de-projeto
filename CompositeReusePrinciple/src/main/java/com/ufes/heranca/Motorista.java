package com.ufes.heranca;

import java.time.LocalDate;

/**
 *
 * @author maycon
 */
public class Motorista extends Pessoa {
    protected String cnh;
    protected String veiculo;

    public Motorista(String cnh, String veiculo, String nome, LocalDate dataNascimento, String cpf, char sexo, String tipoSanguineo) {
        super(nome, dataNascimento, cpf, sexo, tipoSanguineo);
        this.cnh = cnh;
        this.veiculo = veiculo;
    }
    
    
    public String dirigir(){
        return getNome() + " está dirigindo";
    }
    
    @Override
    public String andar(){
        return getNome() + " esta andando de " + getVeiculo();
    }
    
    
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
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

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    @Override
    public String toString() {
        return "Mot orista: " + getNome() +
                "\nCNH: " + cnh + 
                "\nVeiculo: " + veiculo;
    }
    
    
}   
