package com.ufes.heranca;

import java.time.LocalDate;


public class Teste {
    public static void main(String[] args) {
        
        LocalDate d1 = LocalDate.of(1996, 5, 12);
        Funcionario func = new Funcionario("D12", "Desenvolvedor", 4500, "Richard Gonzales", d1, "123.321.123-21", 'M', "O-");
        Motorista motorista = new Motorista ("1111111", "Veículo de Passeio", "Richard Gonzales", d1, "123.321.123-21", 'M', "O-");
        
        System.out.println(func.toString());
        System.out.println(motorista.toString()+"\n");
        
        System.out.println(func.andar()); //Funcionario tem o metodo andar pois herdou da superclasse; mas seria realmente necessario?
        System.out.println(motorista.andar());
        
    }
}
