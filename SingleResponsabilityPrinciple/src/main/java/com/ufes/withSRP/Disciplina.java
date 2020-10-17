/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.withSRP;

/**
 *
 * @author maycon
 */
public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private int creditos;
    private Professor professor;
    private Departamento departamento;

    public Disciplina(String nome, int cargaHoraria, int creditos, Professor professor, Departamento departamento) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.creditos = creditos;
        this.professor = professor;
        this.departamento = departamento;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        String disciplina = "";
        disciplina += "Disciplina: " + getNome() + "\n";
        disciplina += "Carga Horária: " + getCargaHoraria() + "\n";
        disciplina += "Créditos: " + getCreditos() + "\n";
        disciplina += "Professor: " + getProfessor().getNome() + "\n";
        disciplina += "Departamento: " + getDepartamento().getNome() + "\n";
        
        return disciplina;
    }
      
}
