package MetodosEstaticos;

public class CalculoArea {
    public static double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
    
    public static double calcularAreaRetangulo(
        double largura, double altura) 
    {
        return largura*altura;
    }
    
    public static double calcularAreaTrianguloIsosceles(
        double base, double altura) 
    {
        return base*altura /2;
    }    
}
