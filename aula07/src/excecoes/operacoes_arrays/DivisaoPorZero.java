
package excecoes.operacoes_arrays;

// Estou criando minha própria exceção
// Perceba que a classe herda de Exception
public class DivisaoPorZero extends Exception {
    private int i;
    private int valor;
    
    public DivisaoPorZero(String msg, int i, int valor) {
        super(msg);
    }
    
    public int getIndex() {
        return this.i;
    }
    
    public int getValue() {
        return this.valor;
    }    
}
