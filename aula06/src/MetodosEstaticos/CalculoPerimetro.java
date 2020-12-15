package MetodosEstaticos;

public class CalculoPerimetro {
    
    public static double calcularPerimetroCirculo(double raio) {
        return 2*Math.PI*raio;
    }    
    
    public static double calcularPerimetroRetangulo(
            double largura, double altura) 
    {
        return (largura + altura ) *2;
    }
    
    public static double calcularPerimetroTrianguloIsosceles(
        double lado, double base) 
    {
        return lado*2 + base;
    }    
}
