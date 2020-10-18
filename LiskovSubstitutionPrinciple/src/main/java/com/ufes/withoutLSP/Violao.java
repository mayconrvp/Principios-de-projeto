package com.ufes.withoutLSP;

/**
 *
 * @author maycon
 */
public class Violao {
    private String timbre;
    private String afinacao;

    public String tocar(){
        return "VREAUM Vreaum";
    }
    
    public String getTimbre() {
        return timbre;
    }

    public void setTimbre(String timbre) {
        this.timbre = timbre;
    }

    public String getAfinacao() {
        return afinacao;
    }

    public void setAfinacao(String afinacao) {
        this.afinacao = afinacao;
    }
    
}
