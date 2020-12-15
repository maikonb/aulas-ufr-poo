package FormasGeometricas;

public class Retangulo extends FormaGeometrica {
    
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    double calcularArea() {
        return largura*altura;
    }

    @Override
    double calcularPerimetro() {
        return (largura + altura ) *2;
    }

    @Override
    String quemSou() {
        return "Retangulo";
    }
    
}
