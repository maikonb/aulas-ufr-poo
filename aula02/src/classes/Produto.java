package classes;

public class Produto {
    
    private String nome;
    private String departamento;
    private int estoque;
    private float preco;

    public Produto() {
    }

    public Produto(String nome, String departamento,
            int estoque, float preco)
    {
        this.nome = nome;
        this.departamento = departamento;
        this.estoque = estoque;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }    
    
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String toString() {
        return  "Nome: " + this.nome + ", " +
                "Departamento: " + this.departamento + ", " +
                "Estoque: " + this.estoque + ", " +
                "Preco: " + this.preco;
    }
  
}
