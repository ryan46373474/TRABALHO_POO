package exercicio2;

public class MainFornecedor {
    public static void main(String[] args) {
        Fornecedor f = new Fornecedor("Carlos", "Rua A, 123", "99999-8888", 5000.0, 1200.0);

        System.out.println("Nome: " + f.getNome());
        System.out.println("Endereço: " + f.getEndereco());
        System.out.println("Telefone: " + f.getTelefone());
        System.out.println("Crédito: " + f.getValorCredito());
        System.out.println("Dívida: " + f.getValorDivida());
        System.out.println("Saldo disponível: " + f.obterSaldo());

        f.setValorDivida(3000.0);
        System.out.println("Nova dívida: " + f.getValorDivida());
        System.out.println("Saldo atualizado: " + f.obterSaldo());

        f.setNome("Carlos Silva");
        System.out.println("Nome (alterado): " + f.getNome());
    }
}

