package MetodosEstaticos;

public class Retangulo extends FormaGeometrica {
    
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    double calcularArea() {
        return CalculoArea
            .calcularAreaRetangulo(largura, altura);
    }

    @Override
    double calcularPerimetro() {
        return CalculoPerimetro.
            calcularPerimetroRetangulo(largura, altura);
    }

    @Override
    String quemSou() {
        return "Retangulo";
    }
    
}
