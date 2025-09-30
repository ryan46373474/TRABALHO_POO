package exercicio4;

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];

        veiculos[0] = new Carro("Toyota", "Corolla", 4);
        veiculos[1] = new Moto("Honda", "CB500", 500);
        veiculos[2] = new Carro("Ford", "Fiesta", 2);

        for (Veiculo v : veiculos) {
            v.exibirInfo();
        }
    }
}
