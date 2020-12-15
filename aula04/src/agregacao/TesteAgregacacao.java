
package agregacao;

import java.util.ArrayList;

public class TesteAgregacacao {
    public static void main(String[] args) {
        Opcional[] opcionais = {
            new Opcional("Vidros eletricos"),
            new Opcional("Ar Condicionado"),
            new Opcional("Teto solar"),
            new Opcional("Kit multimidia"),
            new Opcional("Farol de Xenon")        
        };
        ArrayList<Carro> carros = new ArrayList<>();
        
        Carro opala = new Carro("Opala", 1980);
        opala.addOpcional(opcionais[1]);
        opala.addOpcional(opcionais[2]);
        carros.add(opala);
        
        Carro chevete = new Carro("Chevete", 1985);
        chevete.addOpcional(opcionais[4]);
        chevete.addOpcional(opcionais[3]);
        carros.add(chevete);
        
        for(Carro c: carros) {
            System.out.println("Carro: " + c.getModelo() +
                    " - " + c.getAno());
            
            for(Opcional o: c.getOpcionais()) {
               System.out.println("  - " + o.getOpcional()); 
            }
        }
    }
}
