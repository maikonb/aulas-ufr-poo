package FormasGeometricas;

public class TrianguloIsosceles extends FormaGeometrica {

    private double base;
    private double altura;
    private double lado;

    public TrianguloIsosceles(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.lado = Math.sqrt( 
            Math.pow(base/2, 2) +  
            Math.pow(altura, 2)
        );
    }
    
    @Override
    double calcularArea() {
        return base*altura /2;
    }

    @Override
    double calcularPerimetro() {
        return lado*2 + base;
    }

    @Override
    String quemSou() {
        return "Triangulo Isosceles";
    }
    
}
