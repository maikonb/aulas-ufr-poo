package classes;

public class Pessoa {
    
    private String nome;
    private int idade;
    private String pai;
    private String mae;
    
    public Pessoa() {
        nome = "";
        idade = 0;
        pai = "";
        mae = "";
    }
    
    public Pessoa(String nome, int idade, String pai, String mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }
    
    public String getPai() {
        return this.pai;
    }    

    public void setMae(String mae) {
        this.mae = mae;
    }
    
    public String getMae() {
        return this.mae;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void imprimir() {
        System.out.println(
            "Nome: " + this.nome + ", " +
            "Idade: " + this.idade + ", " +
            "Pai: " + this.pai + ", " +
            "Mae: " + this.mae
        );
    }
    
    public String toString() {
        return 
            "Nome: " + this.nome + ", " +
            "Idade: " + this.idade + ", " +
            "Pai: " + this.pai + ", " +
            "Mae: " + this.mae;
    }
}
