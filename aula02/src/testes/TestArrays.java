package testes;

public class TestArrays {
    public static void main(String[] args) {
        
        int[] v1 = { 10,20,30,40,50 };
        int v2[] = { 10,20,30,40,50 };
        int[] v3 = new int[5];
        v3[0] = 10;
        v3[1] = 20;
        v3[2] = 30;
        v3[3] = 40;
        v3[4] = 50;
        System.out.println("Tamanho do array: " + v1.length);
        
        
        // Lacos de Repeticao
        
        for(int i=0; i<v1.length; i++) {
            System.out.print(v1[i] + ", ");
        }
        System.out.println();
        
        int i = 0;
        while(i < v1.length) {
            System.out.print(v1[i] + ", ");
            i++;
        }
        System.out.println();
        
        i = 0;
        do {
            System.out.print(v1[i] + ", ");
            i++;            
        } while(i < v1.length);
        System.out.println();
        
        for(int j: v1) 
            System.out.print(j + ", ");
        System.out.println();        
    }
}
