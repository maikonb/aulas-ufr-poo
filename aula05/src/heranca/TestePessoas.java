package heranca;

import java.util.ArrayList;

public class TestePessoas {

    public static void imprimir(Pessoa p) {
        System.out.println(p);
    }
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Roberto","Av. Brasil, 1500", "45 90907070");
        PessoaJuridica pj = new PessoaJuridica("Comercio de Alimentos", 
                "Av. Cel. Castelo Branco, 1900", "66 32323232", 
                "00.000.000/0001-50");
        PessoaFisica pf = new PessoaFisica("Rubens", "Rua MT, 400", 
                "66 9898 8280", "045.545.667-77","Maria");
        
        System.out.println(pf);
        System.out.println(pj);
        
        Pessoa p1 = pf;
        Pessoa p2 = pj;
        
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p);
        pessoas.add(pj);
        pessoas.add(pf);
        pessoas.add(p1);
        pessoas.add(p2);
                
        imprimir(p);
        imprimir(pj);
        imprimir(pf);
    }
    
}
