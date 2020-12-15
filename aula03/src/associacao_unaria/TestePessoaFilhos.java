
package associacao_unaria;

public class TestePessoaFilhos {
   public static void main(String[] args)  {
       PessoaFilhos joao = new PessoaFilhos("Joao", 40);
       PessoaFilhos ze = new PessoaFilhos("Ze", 10);
       PessoaFilhos ana = new PessoaFilhos("Ana", 8);
       joao.addFilho(ze);
       joao.addFilho(ana);
       System.out.println(joao);
   }
}
