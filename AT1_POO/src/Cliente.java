class Cliente {
    private String nome;
    private String email;
    private int pontosFidelidade;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.pontosFidelidade = 0;
    }

    public void adicionarPontos(int pontos) {
        pontosFidelidade += pontos;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Pontos de Fidelidade: " + pontosFidelidade);
        System.out.println("-------------------------");
    }
}

public class ProjetoLivraria {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Larissa", "larissa@email.com");
        Cliente c2 = new Cliente("Ryan", "ryan@email.com");

        c1.adicionarPontos(20);
        c2.adicionarPontos(35);

        c1.exibirInfo();
        c2.exibirInfo();
    }
}