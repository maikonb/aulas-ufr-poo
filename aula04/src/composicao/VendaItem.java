package composicao;

public class VendaItem {
    
    private double desconto;
    private int quantidade;
    private Produto produto;

    public VendaItem() {
    }

    public VendaItem(double desconto, int quantidade, Produto produto) {
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
