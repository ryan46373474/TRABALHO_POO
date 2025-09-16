class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo da conta " + numeroConta + ": R$" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("001", "Ryan", 500.0);
        ContaBancaria conta2 = new ContaBancaria("002", "Larissa", 1000.0);

        conta1.consultarSaldo();
        conta1.depositar(200.0);
        conta1.sacar(100.0);
        conta1.consultarSaldo();

        System.out.println("--------------------");

        conta2.consultarSaldo();
        conta2.depositar(500.0);
        conta2.sacar(1200.0);
        conta2.consultarSaldo();
    }
}