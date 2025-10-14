public abstract class FuncionarioAbstrato {
    double salarioBase;

    public FuncionarioAbstrato(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioFinal();
}

