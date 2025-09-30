public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Lucas", 20, "M", 123, "TI");
        Professor p = new Professor("Marcos", 45, "M", "Matemática", 3500.0);
        Funcionario f = new Funcionario("Ana", 30, "F", "Administração", true);

        a.fazerAniv();
        p.receberAum(500);
        f.mudarTrabalho("Financeiro");

        System.out.println(a.getNome() + ", " + a.getIdade() + " anos, cursa " + a.getCurso());
        System.out.println(p.getNome() + ", recebe R$" + p.getSalario() + " como professor de " + p.getEspecialidade());
        System.out.println(f.getNome() + ", trabalha no setor de " + f.getSetor() + ", em atividade: " + f.isTrabalhando());
    }
}
