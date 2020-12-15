package turma;

public class Aluno extends Pessoa {
    
    private int matricula;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, 
            String telefone, int idade, int matricula) 
    {
        super(nome, cpf, telefone, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return this.matricula + " - " + this.getNome();
    }    
    
}
