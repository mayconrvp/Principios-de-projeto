package com.ufes.withLSP;

/**
 *
 * @author maycon
 */
public abstract class Instrumento {
    private String timbre;
    public abstract String tocar();

    public String getTimbre() {
        return timbre;
    }

    public void setTimbre(String timbre) {
        this.timbre = timbre;
    }
    
}
