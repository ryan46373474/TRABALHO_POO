package exercicio4;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Portas: " + quantidadePortas);
    }
}
