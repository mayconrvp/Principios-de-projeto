package withDRY;

/**
 *
 * @author maycon
 */
public class Teste {
    public static void main(String[] args) {
        
        //Exemplo 1
        Viagem viagem = new Viagem("Onibus", "Vitória - ES", "Texeira de Freitas - BA");
        Viagem viagem2 = new Viagem("Avião", "Rio de Janeiro - RJ", "Campinas - SP");
        
        System.out.println(viagem.viajar());
        System.out.println(viagem2.viajar());
        System.out.println("");
        
        //Exemplo 2 
        Instrumento inst1 = new Instrumento("Guitarra", "gruiem");
        Instrumento inst2 = new Instrumento("Violão", "vreuam");
        
        System.out.println(inst1.tocar());
        System.out.println(inst2.tocar());
    }
}
