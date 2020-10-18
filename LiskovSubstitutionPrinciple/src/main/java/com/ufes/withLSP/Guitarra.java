package com.ufes.withLSP;

/**
 *
 * @author maycon
 */
public class Guitarra extends Instrumento{
    private String timbre;
    
    @Override
    public String tocar(){
        if (timbre == null){
            return "GREAUM Greaum";
        }else{
            return getTimbre();
        }
    }

    public String getTimbre() {
        return timbre;
    }

    public void setTimbre(String timbre) {
        this.timbre = timbre;
    }
    
    
    
}
