package turma;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        
        Disciplina prog = new Disciplina("Programacao");
        Disciplina so = new Disciplina("Sistemas Operacionais");
        Disciplina matematica = new Disciplina("Matematica"); 
        
        Aluno aMauro = new Aluno("Mauro", "54.987-12", "66 9454", 21, 2018454);
        Aluno aAna   = new Aluno("Ana", "123-12", "66 99-9454", 23, 2845654);        
        Aluno aJose  = new Aluno("Jose", "9877-22", "66 6546", 20, 20897988);        
        
        Professor pJoao = new Professor("Joao", "454.545", "3212454", 40, 
            "Sistemas de Informação", "Me");
        Professor pMaria = new Professor("Maria", "787.878", "3232787", 25, 
            "Sistemas de Informação", "Dr");
        Professor pAbel = new Professor("Abel", "123.124", "897878", 32, 
            "Matematica", "Dr");
        
        Turma t1 = new Turma(20201, pJoao, prog);
        Turma t2 = new Turma(20201, pMaria, so);
        Turma t3 = new Turma(20201, pAbel, matematica);
        
        t1.matricularAluno(aAna);
        t1.matricularAluno(aJose);
        t2.matricularAluno(aMauro);
        t2.matricularAluno(aJose);
        t3.matricularAluno(aAna);
        t3.matricularAluno(aMauro);
        t3.matricularAluno(aJose);
        
        t1.imprimirTurma();
        t2.imprimirTurma();
        t3.imprimirTurma();
        
        

    }
}
