package FormasGeometricas;

public class Circulo extends FormaGeometrica {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    double calcularPerimetro() {
        return 2*Math.PI*raio;
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
