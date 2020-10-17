/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.withSRP;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author maycon
 */
public class Teste {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(1990,2,1);
        Professor professor = new Professor("Richard Fonseca", "111.222.333-44", data ,"2010AAM123");
        Departamento departamento = new Departamento ("Departamento de Matemática", 6);
        Disciplina disciplina = new Disciplina("Cáclulo A", 90, 5, professor, departamento);
                
        System.out.println(disciplina.toString());
        
    }
}
