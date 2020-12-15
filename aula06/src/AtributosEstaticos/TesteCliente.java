package AtributosEstaticos;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Mateus");
        Cliente c2 = new Cliente("Isadora");
        Cliente c3 = new Cliente("Ana");
        Cliente c4 = new Cliente("Jose");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(Cliente.NOMECLASSE);
    }
}
