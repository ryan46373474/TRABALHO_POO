package EXERCICIOS_OBJETIVOS;
public class Professor {
    String nome;

    public Professor(String nome) {
        this.nome = nome;
    }
}

public class Turma {
    String codigo;
    Professor professor;

    public Turma(String codigo) {
        this.codigo = codigo;
    }

    void setProfessor(Professor p) {
        this.professor = p;
    }

    void resumo() {
        System.out.println("Código da turma: " + codigo);
        System.out.println("Professor: " + professor.nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Carlos");
        Turma turma = new Turma("MAT101");
        turma.setProfessor(prof1);
        turma.resumo();

        Professor prof2 = new Professor("Ana");
        turma.setProfessor(prof2);
        turma.resumo();
    }
}
