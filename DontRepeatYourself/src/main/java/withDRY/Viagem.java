package withDRY;

/**
 *
 * @author maycon
 */
public class Viagem {
    private String cidOrigem;
    private String cidDestino;
    private String transporte;

    public Viagem(String transporte, String cidOrigem, String cidDestino) {
        this.cidOrigem = cidOrigem;
        this.cidDestino = cidDestino;
        this.transporte = transporte;
    }
    
    
    public String viajar(){
        return "Viajando de " +getTransporte() +" de "+ getCidOrigem() + " para "+ getCidDestino();
    }

    public String getCidOrigem() {
        return cidOrigem;
    }

    public String getCidDestino() {
        return cidDestino;
    }

    public String getTransporte() {
        return transporte;
    }
    
    
}
