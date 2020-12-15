package associacao_binaria;

public class TesteFuncionario {
    public static void main(String[] args) {
        Departamento depTi = new Departamento("Tecnologia da Informacao");
        Departamento depFi = new Departamento("Financeiro");
        Departamento depRh = new Departamento("Recursos Humanos");
        
        Funcionario[] funcionarios = {
            new Funcionario("Joao", 100, "Analista Suporte", depTi),
            new Funcionario("Pedro", 101, "Analista Financeiro", depFi),
            new Funcionario("Ana", 100, "Analista Sistemas", depTi),
            new Funcionario("Mauro", 100, "Gerente", depRh),
            new Funcionario("Paulo", 100, "Psicologo", depRh),
        };
        
        for (Funcionario f: funcionarios) {
            System.out.println("Nome: " + f.getNome());
            if (f.getDepartamento() != null) {
                System.out.println("Departamento: " + 
                    f.getDepartamento().getNomeDepartamento());
            }
            System.out.println();
            
        }
    }
}
