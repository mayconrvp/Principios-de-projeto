package com.ufes.withoutLSP;

/**
 *
 * @author maycon
 */
public class Guitarra extends Violao {
    private String timbre;
    private String afinacao;

    public String tocar(){
        return "Greaum greaum";
    }
    
    @Override
    public String getTimbre() {
        return timbre;
    }

    @Override
    public void setTimbre(String timbre) {
        this.timbre = timbre;
    }

    @Override
    public String getAfinacao() {
        return afinacao;
    }

    @Override
    public void setAfinacao(String afinacao) {
        this.afinacao = afinacao;
    }
    
    
}
