package excecoes.operacoes_arrays;

// Estou criando minha própria exceção
// Perceba que a classe herda de Exception
public class TamanhosDiferentes extends Exception {
    private int tamanho1;
    private int tamanho2;
    
    public TamanhosDiferentes(String msg, int tamanho1, int tamanho2) {
        super(msg);
        this.tamanho1 = tamanho1;
        this.tamanho2 = tamanho2;
    }
    
    public int getTam1() {
        return this.tamanho1;
    }
    
    public int getTam2() {
        return this.tamanho2;
    }    
}
