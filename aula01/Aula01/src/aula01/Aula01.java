package aula01;

public class Aula01 {

    int idade;
    String nome;
    
    public void imprimirOi(String nome) {
        System.out.println("Oi " + nome);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int vari = 1;
        String vars = "Ola";
        
        int valorInteiro = 10;
        byte valorByte = 0;
        float valorFloat = 0;
        double valorDouble = 0;
        long valorLong = 0;
        boolean valorBoolean = false;
        short valorShort = 90;
        char valorChar = 'A';
        String valorString = "Java";
        
        System.out.println("Valor: " + valorString);
        
        //Operacoes com inteiros
        valorInteiro = 100;
        valorInteiro = 100 * 2;
        valorInteiro = 100 / 2;
        valorInteiro = 100 % 3;
        valorInteiro = 100 + 2;
        valorInteiro = 100 - 2;
        
        System.out.println("valorInteiro = " + valorInteiro);
        
        // Incremento / Decremento
        valorInteiro++; // valorInteiro = valorInteiro + 1;
        ++valorInteiro;
        valorInteiro--; // valorInteiro = valorInteiro - 1;
        --valorInteiro;
        valorInteiro += 1;//valorInteiro = valorInteiro + 1;
        
        valorInteiro = 100;
        System.out.println("* valorInteiro = " + valorInteiro++);
        System.out.println("* valorInteiro = " + valorInteiro);

        // Operacoes bitwise - bit a bit
        valorInteiro = 1024;
        valorInteiro = valorInteiro | 1;
        valorInteiro |=  1;
        valorInteiro = valorInteiro & 1;
        valorInteiro = valorInteiro << 2;
        valorInteiro = valorInteiro >> 2;
        System.out.println("* valorInteiro = " + valorInteiro); 
        
        // Operacoes com Float
        valorFloat = 100 * 99.9f;
        valorFloat = Math.round(valorFloat);
        valorFloat = 115.5f;
        
        // Operacoes com Double
        valorDouble = 5.0;
        valorDouble = Math.pow(2, 20);
        valorDouble = Math.min(5, 50);
        valorDouble = Math.max(5, 50);
        valorDouble = Math.sqrt(81);
        valorDouble = Math.round(81.85);
        
        // Operacoes Logicas
        valorBoolean = true;
        valorBoolean = false;
        valorBoolean = 100 == 10; // igual
        valorBoolean = 100 != 10; // diferente
        valorBoolean = 100 > 10;  // maior
        valorBoolean = 100 >= 10; // maior igual
        valorBoolean = (100 >= 10) && (10 < 20); // & = E
        valorBoolean = (100 >= 10) || (10 < 20); // & = OU
        valorBoolean = !(100 != 10); // ! = NOT
        
        // Operacoes String
        valorString = "Minha String";
        valorString = valorString + " Texto ";
        valorString = valorString + valorDouble;
        valorString = "Minha String";
        
        System.out.println(valorString);
        System.out.println(valorString.substring(1, 9));
        System.out.println("Equals: " +
                valorString.equals("Minha String"));
        System.out.println("equalsIgnoreCase: " +
                valorString.equalsIgnoreCase("minha string"));
        System.out.println("toUpperCase: " +
                valorString.toUpperCase());
        System.out.println("toLowerCase: " +
                valorString.toLowerCase());
        System.out.println("contains: " +
                valorString.contains("tring"));
        System.out.println("startsWith: " +
                valorString.startsWith("Minha"));
        System.out.println("replace: " +
                valorString.replace("Minha", "Nossa"));
        valorString = "       Minha String    ";
        System.out.println("trim: " +
                valorString.trim());
        System.out.println("length valorString: " +
                valorString.length() );
        
        
        // Estruturas de Selecao
        if (valorInteiro > 5) {

        }
        if (valorInteiro < 50) {

        }
        else {

        }
        
        

        int i1 = 4;
        switch(i1) {
            case 1:
                System.out.println("i = 1");
                break;
            case 2:
                System.out.println("i = 2");
                break;
            case 3:
                System.out.println("i = 3");
                break;
            case 4:
            case 5:
                System.out.println("i = 4 ou i = 5");
                break;
            default:
                System.out.println("i = default");
        }
        
        // Instancias de classes
        Aula01 aula01a = new Aula01();
        aula01a.nome = "Joao";
        aula01a.idade = 20;
        aula01a.imprimirOi("Mateus");
        
        Aula01 aula01b = new Aula01();
        aula01b.nome = "Jose";
        aula01b.idade = 30;
        aula01b.imprimirOi("Mateus");
    }
    
}

