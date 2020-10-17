/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.withoutSRP;

/**
 *
 * @author maycon
 */
public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private int creditos;
    private String professor;
    private String departamento;
    private int codDepartamento;

    public Disciplina(String nome, int cargaHoraria, int creditos, String professor, String departamento, int codDepartamento) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.creditos = creditos;
        this.professor = professor;
        this.departamento = departamento;
        this.codDepartamento = codDepartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }
    

    @Override
    public String toString() {
        String disciplina = "";
        disciplina += "Nome da Disciplina: " + nome + "\n";
        disciplina += "Carga horária: " + cargaHoraria + "\n";
        disciplina += "Créditos: " + creditos + "\n";
        disciplina += "Professor: " + professor + "\n";
        disciplina += "Departamento: " + departamento + "\n";
        disciplina += "Código do Departamento: " + codDepartamento + "\n";
        
        return disciplina;
    } 
}