/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withDRY;

/**
 *
 * @author maycon
 */
public class Instrumento {
    private String nome;
    private String timbre;

    public Instrumento(String nome, String timbre) {
        this.nome = nome;
        this.timbre = timbre;
    }

    public String tocar(){
        return "O timbre do(a) "+getNome()+" é "+getTimbre();
    }
    
    public String getNome() {
        return nome;
    }

    public String getTimbre() {
        return timbre;
    }
    
    
}
