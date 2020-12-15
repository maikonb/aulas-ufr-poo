package AtributosEstaticos;

public class Cliente {
    private int id;
    private String nome;
    private static int nextId = 1;
    public static final String NOMECLASSE = "Cliente";

    public Cliente(String nome) {
        this.nome = nome;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString() {
        return "ID: " + this.id + 
               " Nome: " + this.nome;
    }
    
    
    
}
