class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("----------------------");
    }

    public void ligar() {
        System.out.println("O carro " + marca + " " + modelo + " está ligado!");
    }
}

public class ProjetoCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2019);

        carro2.setMarca("Ford");
        carro2.setModelo("Focus");
        carro2.setAno(2022);

        System.out.println("== Informações Atualizadas ==");
        carro2.mostrarInfo();

        System.out.println("== Usando os métodos ==");
        carro1.mostrarInfo();
        carro1.ligar();
        carro2.ligar();
    }
}