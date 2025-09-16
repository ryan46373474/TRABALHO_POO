public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ryan", 67890, 8.0, 6.5);
        Aluno aluno2 = new Aluno("Larissa", 12345, 5.0, 4.0);
        System.out.println("== Alunos ==");
        aluno1.mostrarDados();
        aluno2.mostrarDados();
        aluno2.setNotaAv2(7.0);
        System.out.println("== Alunos atualizados ==");
        aluno2.mostrarDados();
        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();

        System.out.println("\n== Contas Bancárias ==");
        ContaBancaria conta1 = new ContaBancaria("001", "Ryan", 500.0);
        ContaBancaria conta2 = new ContaBancaria("002", "Larissa", 1000.0);
        conta1.consultarSaldo();
        conta1.depositar(200.0);
        conta1.sacar(100.0);
        conta1.consultarSaldo();
        conta2.consultarSaldo();
        conta2.depositar(500.0);
        conta2.sacar(1200.0);
        conta2.consultarSaldo();

        System.out.println("\n== Carros ==");
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2019);
        carro2.setMarca("Ford");
        carro2.setModelo("Focus");
        carro2.setAno(2022);
        carro1.mostrarInfo();
        carro2.mostrarInfo();
        carro1.ligar();
        carro2.ligar();

        System.out.println("\n== Livros ==");
        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien", 59.90);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 39.50);
        livro1.exibirInfo();
        livro2.exibirInfo();
        livro1.setPreco(49.90);
        livro2.setTitulo("Dom Casmurro - Edição Especial");
        System.out.println("== Livros atualizados ==");
        livro1.exibirInfo();
        livro2.exibirInfo();
        livro1.aplicarDesconto(10);
        livro2.aplicarDesconto(5);
        System.out.println("== Livros depois do desconto ==");
        livro1.exibirInfo();
        livro2.exibirInfo();

        System.out.println("\n== Clientes ==");
        Cliente c1 = new Cliente("Larissa", "larissa@email.com");
        Cliente c2 = new Cliente("Ryan", "ryan@email.com");
        c1.exibirInfo();
        c2.exibirInfo();
        c1.adicionarPontos(20);
        c2.adicionarPontos(35);
        System.out.println("== Clientes atualizados ==");
        c1.exibirInfo();
        c2.exibirInfo();
    }
}
