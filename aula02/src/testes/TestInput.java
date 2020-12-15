package testes;

import java.util.Scanner;

public class TestInput {

    public static void main(String[] args) {
        
        String s; int i; float f;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        s = reader.nextLine();
        System.out.println("Seu nome eh: " + s);
        
        System.out.println("Digite sua idade: ");
        i = Integer.parseInt( reader.nextLine() );
        System.out.println("Sua idade eh: " + i);
        System.out.printf("Idade: %05d\n", i);
        
        System.out.println("Digite o preco: ");
        f = Float.parseFloat( reader.nextLine() );
        System.out.println("O preco eh: " + f);
        System.out.printf("Preco: %5.2f\n", f);
       
    }
    
}
