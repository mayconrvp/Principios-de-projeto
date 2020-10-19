package com.ufes.withoutDRY;

/**
 *
 * @author maycon
 */
public class Viagem {
    private String cidOrigem;
    private String cidDestino;
    private String transporte;

    public Viagem(String cidOrigem, String cidDestino) {
        this.cidOrigem = cidOrigem;
        this.cidDestino = cidDestino;
    }
    
    //Principio da Lei de Demeter visa evitar duplicação de código; 
    //o que acontece nessa classe com 3 métodos viajar, que estão se repetindo;
    
    public String viajarOnibus(){
        this.transporte = "Onibus";
        return "Viajando de "+ this.transporte + " de "+ getCidOrigem() + " para "+getCidDestino();
    }
    
    public String viajarTrem(){
        this.transporte = "Trem";
        return "Viajando de "+ this.transporte + " de "+ getCidOrigem() + " para "+getCidDestino();
    }
    
    public String viajarAvião(){
        this.transporte = "Avião";
        return "Viajando de "+ this.transporte + " de "+ getCidOrigem() + " para "+getCidDestino();
    }

    public String getCidOrigem() {
        return cidOrigem;
    }

    public String getCidDestino() {
        return cidDestino;
    }
    
    
}
