package turma;

public class Professor extends Pessoa {
    
    private String curso;
    private String titulacao;

    public Professor() {
    }

    public Professor(String nome, String cpf, 
            String telefone, int idade, String curso, String titulacao) 
    {
        super(nome, cpf, telefone, idade);
        this.curso = curso;
        this.titulacao = titulacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    public String toString() {
        return this.titulacao + ". " + this.getNome();
    }
    
}
