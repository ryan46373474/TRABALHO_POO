class Aluno {
    private String nome;
    private int matricula;
    private double notaAv1;
    private double notaAv2;

    public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    public void setNotaAv1(double notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public void setNotaAv2(double notaAv2) {
        this.notaAv2 = notaAv2;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + notaAv1);
        System.out.println("Nota AV2: " + notaAv2);
        System.out.println("------------------------");
    }

    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2.0;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            System.out.println(nome + " está aprovado. Média: " + media);
        } else if (media >= 4.0) {
            System.out.println(nome + " está de recuperação. Média: " + media);
        } else {
            System.out.println(nome + " está reprovado. Média: " + media);
        }
    }
}

public class ProjetoAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Larissa", 12345, 8.0, 6.5);
        Aluno a2 = new Aluno("Ryan", 67890, 5.0, 4.5);

        System.out.println("== Dados iniciais ==");
        a1.mostrarDados();
        a2.mostrarDados();

        a2.setNotaAv2(7.0);

        System.out.println("== Dados atualizados ==");
        a2.mostrarDados();

        System.out.println("== Verificação de aprovação ==");
        a1.verificarAprovacao();
        a2.verificarAprovacao();
    }
}