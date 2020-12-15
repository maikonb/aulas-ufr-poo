package composicao;

public class TesteComposicao {
    public static void main(String[] args) {
        
        Produto[] produtos = { 
            new Produto("Feijao", 10),
            new Produto("Arroz", 12),
            new Produto("Alcatra KG", 24),
            new Produto("Sabao em Po 5 KG", 7), 
            new Produto("Tomate KG", 5.00),
            new Produto("Manteiga 500 gramas", 12),
        };
        
        Venda v1 = new Venda("Roberto");
        v1.addItem(new VendaItem(0, 2, produtos[1]));
        v1.addItem(new VendaItem(0.1, 1, produtos[0]));
        v1.addItem(new VendaItem(0.2, 2, produtos[2]));
        
        Venda v2 = new Venda("Adriano");
        v2.addItem(new VendaItem(0, 4, produtos[2]));
        v2.addItem(new VendaItem(0.1, 5, produtos[3]));
        v2.addItem(new VendaItem(0.2, 3, produtos[4]));

        Venda v3 = new Venda("Paula");
        v3.addItem(new VendaItem(0, 3, produtos[3]));
        v3.addItem(new VendaItem(0.5, 2, produtos[4]));
        v3.addItem(new VendaItem(0.2, 2, produtos[5]));
        
        Venda[] vendas = {v1, v2, v3};
        
        for(Venda v: vendas) {
            System.out.println("Cliente: " + v.getCliente());
            System.out.println("Itens:");
            for(VendaItem vi: v.getItens()) {
                double totalParcial = vi.getProduto().getPreco() *
                        vi.getQuantidade() * (1-vi.getDesconto());
                System.out.println("  - " +
                    vi.getProduto().getNome() + 
                    "   R$ " + vi.getProduto().getPreco() +
                    "   Qtde: " + vi.getQuantidade() +
                    "   Desconto: " + (vi.getDesconto()*100) + "%" + 
                    "   Total: " + totalParcial);
            }   
            System.out.println("Total:  R$" + v.getTotal() );
            System.out.println("-------------------------");
        }

    }
}
