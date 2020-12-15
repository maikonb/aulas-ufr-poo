package testes;

import classes.Produto;
import java.util.Scanner;

public class TestProduto {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Monitor HP", 
                "Informatica", 20, 1000.99f);
        System.out.println(p1);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Quantos produtos? ");
        int n = Integer.parseInt( scan.nextLine() );
        
        Produto vp[] = new Produto[n];
        
        String nome, departamento;
        int estoque; float preco;
        
        for(int i=0; i<n; i++) {
            System.out.println("Produto " + (i+1) + ": ");
            System.out.print("Nome: ");
            nome = scan.nextLine();
            System.out.print("Departamento: ");
            departamento = scan.nextLine();
            System.out.print("Estoque: ");
            estoque = Integer.parseInt( scan.nextLine() );
            System.out.print("Preco: ");
            preco = Float.parseFloat(scan.nextLine() );
            
            vp[i] = new Produto(nome, departamento, 
                        estoque, preco);
        }
        
        
        for(Produto p: vp) {
            System.out.println("------------");
            System.out.println(p);
            System.out.println("------------");
        }
    }
}
