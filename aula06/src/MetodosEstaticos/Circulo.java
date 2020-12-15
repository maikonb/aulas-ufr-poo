package MetodosEstaticos;

public class Circulo extends FormaGeometrica {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    double calcularArea() {
        return CalculoArea
            .calcularAreaCirculo(raio);
    }

    @Override
    double calcularPerimetro() {
        return CalculoPerimetro
                .calcularPerimetroCirculo(raio);
    }

    @Override
    String quemSou() {
        return "Circulo";
    }
    
    @Override
    public String toString() {
        return "Forma Geometrica - Circulo";
    }    
}
