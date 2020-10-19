package withLOD;


public class Item {
    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public double valorTotal(){
        double total = this.produto.getValor() * this.quantidade;
        return total;
    }
    
    
}
