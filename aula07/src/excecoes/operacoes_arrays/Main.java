
package excecoes.operacoes_arrays;

public class Main {
    
    public int[] dividir(int a[], int b[]) throws TamanhosDiferentes, DivisaoPorZero {
        if (a.length != b.length)
            throw(new TamanhosDiferentes(
                    "Arrays possuem tamanhos diferentes.", 
                    a.length, b.length));
        int r[] = new int[a.length];
        
        for (int i=0; i<a.length; i++) {
            if (b[i] == 0) {
                throw(new DivisaoPorZero(
                        "Erro de divisao por zero", i, a[i]));
            }
            r[i] = a[i] / b[i];
        }
            
        return r;
    }
    
    public void executar() {
        
        int a[] = new int[5];
        int b[] = new int[6];
        int c[] = {1,2,3,4,0};
        int r[];
        
        try {
            // Teste uma das proximas linhas por vez
            r = dividir(a, b);
            // r = dividir(a, c);
        }
        catch(DivisaoPorZero d) {
            System.out.println(d);
            System.out.println("Erro no indice: " + d.getIndex());
            System.out.println("Dividindo valor " + d.getValue() + " por zero.");
        }
        catch(TamanhosDiferentes t){
            System.out.println(t);
            System.out.println("Tamanho do array 1: " + t.getTam1());
            System.out.println("Tamanho do array 2: " + t.getTam2());
            //t.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        m.executar();
    }
}
