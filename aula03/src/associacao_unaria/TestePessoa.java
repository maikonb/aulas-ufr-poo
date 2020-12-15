package associacao_unaria;

import java.util.ArrayList;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("Joao", 60, null, null);
        Pessoa maria = new Pessoa("Maria", 55, null, null);
        Pessoa zezinho = new Pessoa("Zezinho", 5, joao, maria);
        Pessoa mariana = new Pessoa("Mariana", 9, joao, maria); 
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(joao);
        pessoas.add(maria);
        pessoas.add(zezinho);
        pessoas.add(mariana);
        
        for(Pessoa p: pessoas) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            if(p.getMae() != null)
                System.out.println("Mae: " + p.getMae().getNome());
            if (p.getPai() != null)
                System.out.println("Pai: " + p.getPai().getNome());
            System.out.println();
        }
        
    }
}
