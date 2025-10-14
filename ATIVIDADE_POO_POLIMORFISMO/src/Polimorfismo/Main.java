public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(5, 10));
        System.out.println(calc.somar(3, 7, 2));
        System.out.println(calc.somar(4.5, 6.3));

        FuncionarioBase[] listaDePagamento = new FuncionarioBase[2];
        listaDePagamento[0] = new Gerente();
        listaDePagamento[1] = new Programador();
        for (FuncionarioBase f : listaDePagamento) {
            System.out.println(f.calcularSalario());
        }

        FuncionarioAbstrato dev = new Desenvolvedor(3000.00);
        FuncionarioAbstrato suporte = new Suporte(2500.00);
        System.out.println(dev.calcularSalarioFinal());
        System.out.println(suporte.calcularSalarioFinal());
    }
}
