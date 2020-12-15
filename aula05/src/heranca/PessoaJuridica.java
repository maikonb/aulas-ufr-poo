package heranca;

public class PessoaJuridica extends Pessoa  {
    
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(
            String nome, String endereco, 
            String telefone, String cnpj) 
    {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
 
    public String toString() {
        String s = "Pessoa Juridica - " +
            "Nome: " + getNome() + ", " +
            "Endereco:  " + getEndereco() + ", " +
            "Telefone: " + getTelefone() + ", " + 
            "CNPJ: " + this.cnpj;
        return s;
    }      
}
