package associacao_binaria;

public class Funcionario {
    private String nome;
    private int matricula;
    private String funcao;
    private Departamento departamento;

    public Funcionario() {
    }

    public Funcionario(String nome, int matricula, String funcao, Departamento departamento) {
        this.nome = nome;
        this.matricula = matricula;
        this.funcao = funcao;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
