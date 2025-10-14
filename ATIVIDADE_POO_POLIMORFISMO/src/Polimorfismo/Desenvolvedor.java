public class Desenvolvedor extends FuncionarioAbstrato {
    public Desenvolvedor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + (salarioBase * 0.1);
    }
}

