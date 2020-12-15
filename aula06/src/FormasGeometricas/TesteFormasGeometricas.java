package FormasGeometricas;

import java.util.ArrayList;

public class TesteFormasGeometricas {

    public static void main(String[] args) {
        
        ArrayList<FormaGeometrica> formas;
        formas = new ArrayList<>();
        
        formas.add( new Retangulo(40, 60) );
        formas.add( new Circulo(20) );
        formas.add( new TrianguloIsosceles(30, 40));
        formas.add( new Retangulo(20, 40) );
        formas.add( new Circulo(30) );
        formas.add( new TrianguloIsosceles(60, 80));

        for(FormaGeometrica f: formas) {
            System.out.println(
                f.quemSou() + " - " +
                " Area: " + f.calcularArea() + " - " + 
                " Perimetro: " + f.calcularPerimetro()
            );
            System.out.println(f);
        }
    }
    
}
