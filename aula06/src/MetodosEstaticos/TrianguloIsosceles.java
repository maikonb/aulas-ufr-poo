package MetodosEstaticos;


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
        return CalculoArea
            .calcularAreaTrianguloIsosceles(base, altura);
    }

    @Override
    double calcularPerimetro() {
        return CalculoPerimetro
            .calcularPerimetroTrianguloIsosceles(lado, base);
    }

    @Override
    String quemSou() {
        return "Triangulo Isosceles";
    }
    
}
