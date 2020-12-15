package agregacao;

import java.util.ArrayList;

public class Carro {
    private String modelo;
    private int ano;
    private ArrayList<Opcional> opcionais = new ArrayList<>();

    public Carro() {
    }

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void addOpcional(Opcional o) {
        this.getOpcionais().add(o);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Opcional> getOpcionais() {
        return opcionais;
    }
    
    
}
