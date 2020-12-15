package testes;

import classes.Pessoa;

public class TestPessoa {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Marcos");
        p1.setIdade(22);
        p1.setPai("Tadeu");
        p1.setMae("Marcia");
        
        Pessoa p2 = new Pessoa("Natalia", 20, "Marcos", "Julia");
        
        System.out.println(p1);
        System.out.println(p2);
    }
}
