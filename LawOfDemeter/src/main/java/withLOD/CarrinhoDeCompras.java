package withLOD;

import java.util.ArrayList;



public class CarrinhoDeCompras {
    private String dono;
    private ArrayList<Item> itens;

    public CarrinhoDeCompras(String dono, ArrayList<Item> itens) {
        this.dono = dono;
        this.itens = itens;
    }

    public double valorTotalDeItens(){
        double total = 0;
        for (Item item : itens){
            total += item.valorTotal();
        }
        return total;   
    }
}
