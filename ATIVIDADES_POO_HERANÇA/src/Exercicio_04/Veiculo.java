package exercicio4;

public class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
