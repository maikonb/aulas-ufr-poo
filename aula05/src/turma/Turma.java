package turma;

import java.util.ArrayList;

public class Turma {
    
    private int semestre;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Disciplina disciplina;

    public Turma() {
    }

    public Turma(int semestre, Professor professor, Disciplina disciplina) {
        this.semestre = semestre;
        this.professor = professor;
        this.disciplina = disciplina;
    }
    
    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public int getSemestre() {
        return semestre;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
    
    public void imprimirTurma() {
        System.out.println("Professor: " + this.professor);
        System.out.println("Disciplina: " + this.disciplina.getNomeDisciplina());
        System.out.println("Semestre: " + this.semestre);
        System.out.println("Alunos: ");
        for(Aluno a: this.alunos) {
            System.out.println("  -" + a);
        }
        System.out.println("-----------\n");
    }

    
}
