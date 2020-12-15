package associacao_unaria;

import java.util.ArrayList;

public class PessoaFilhos {
    
    private String nome;
    private int idade;
    private ArrayList<PessoaFilhos> filhos = new ArrayList();

    public PessoaFilhos() {
    }

    public PessoaFilhos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String toString() {
        String s = "";
        s = "Nome: " + this.nome + "\n" +
            "Idade: " + this.idade + "\n" +
            "Filhos: \n";
        for(PessoaFilhos f: this.filhos) {
            s += " - " + f.getNome() + "\n";
        }
        s += "\n";
        return s;
    }
    
    public void addFilho(PessoaFilhos f) {
        this.filhos.add(f);
    }
    
}
