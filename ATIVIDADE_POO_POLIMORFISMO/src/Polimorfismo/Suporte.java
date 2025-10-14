public class Suporte extends FuncionarioAbstrato {
    public Suporte(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + 200.00;
    }
}
