package composicao;

import java.util.ArrayList;

public class Venda {
    private String cliente;
    private double total;
    private ArrayList<VendaItem> itens = new ArrayList<>();

    public Venda() {
    }

    public Venda(String cliente) {
        this.cliente = cliente;
        this.total = 0;
    }
    
    public void addItem(VendaItem item) {
        this.itens.add(item);
        double totalParcial = item.getProduto().getPreco() *
                item.getQuantidade();
        totalParcial *= (1-item.getDesconto());
        this.total += totalParcial;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<VendaItem> getItens() {
        return itens;
    }


    
    
}
