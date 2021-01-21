package excecoes.introducao;

public class Aula07Excecoes {

    public static void main(String[] args) {
        

        /////////////////////////////////////
        // Exemplo 1
        /////////////////////////////////////
        
        
        Classe1 c1 = null;
        
        // Tente descomentar essa proxima linha.
        // Perceba que ela vai gerar um erro que vai interromper a execução
        // do programa. O programa não executará mais nenhuma linha após essa
        // próxima, pois tentou acessar um atributo de um objeto nulo.
        //System.out.println(c1.i);
        
        try {
            
            // Quando colocamos a mesma linha dentro de um bloco try/catch,
            // a JVM vai tentar executar a linha, porém, na ocasião de uma
            // exceção/erro, a executação do programa não será interrompida.
            // O Java te dará a opoertunidade, por meio do bloco 'catch', de 
            // tratar esse erro.
            System.out.println(c1.i);
        }
        catch(NullPointerException e) {
            // imprime toda a pilha de execucao, até
            // chegar na linha em que ocorreu o erro
            //e.printStackTrace();  
            
            System.out.println("Voce tentou utilizar um objeto nulo.");
        }
        System.out.println("Bye");
        
        

        /////////////////////////////////////
        // Exemplo 2
        /////////////////////////////////////
        
        
        
        int v[] = new int[2];
        v[0]=1; v[1]=2;
        
        // Essa proxima linha vai gerar um erro que interromperá a execução
        // do programa. Tente descomentar.
        // System.out.println(v[2]); // posicao v[2] nao existe
        
        
        try { // Tente executar os comandos que estao nesse bloco
            
            // A máquina Java tentará executar a proxima linha
            System.out.println(v[2]); 
            
        }
        catch(ArrayIndexOutOfBoundsException e) {
            // Caso o erro acima ocorra, execute este bloco
            System.out.println("Voce tentou acessar um indice inexistente");
        }
        finally {
            // Este bloco sempre vai executar. Serve para fazer
            // desalocacoes ou terminar a execução, independente da ocorrência
            // de um erro
            System.out.println("Passou pelo try / catch");
        }
        System.out.println("Bye");
    }
    
}
