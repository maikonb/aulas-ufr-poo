package heranca;

public class PessoaFisica extends Pessoa {
    
    private String cpf;
    private String nomeConjuge;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(
            String nome, String endereco, String telefone,
            String cpf, String nomeConjuge) 
    {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.nomeConjuge = nomeConjuge;
    }
 
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeConjuge() {
        return nomeConjuge;
    }

    public void setNomeConjuge(String nomeConjuge) {
        this.nomeConjuge = nomeConjuge;
    }
    
    public String toString() {
        String s = "Pessoa Fisica - " +
            "Nome: " + getNome() + ", " +
            "Endereco:  " + getEndereco() + ", " +
            "Telefone: " + getTelefone() + ", " + 
            "CPF: " + this.cpf + ", " +
            "Conjuge: " + this.nomeConjuge;
        return s;
    }     
    
}
