package com.ufes.composicao;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Chefe chefe1 = new Chefe("Mario José", LocalDate.of(1990, 7, 15), "Analista de Projetos");
        
        Funcionario func1 = new Funcionario ("Andre Souza", LocalDate.of(1989, 4, 2), "Desenvolvedor");
        Funcionario func2 = new Funcionario ("Lucas Vieira", LocalDate.of(1992, 9, 3), "Desenvolvedor");
        Funcionario func3 = new Funcionario ("Andreia Oliveira", LocalDate.of(1991, 4, 4), "Desenvolvedor");
        Funcionario func4 = new Funcionario ("José Silva", LocalDate.of(1996, 3, 9), "Designer");
        Funcionario func5 = new Funcionario ("Luiza Pereira da Silva", LocalDate.of(1997, 6, 10), "UX Designer");
        
        Equipe equipe1 = new Equipe("MaoMassa", "Equipe de front-end", chefe1);
        
        ArrayList <Funcionario> funcs = new ArrayList();
        funcs.add(func1);
        funcs.add(func2);
        funcs.add(func3);
        funcs.add(func4);
        funcs.add(func5);
        
        equipe1.setFuncionariro(funcs);
        
        System.out.println(equipe1.toString());
        
    }
}
