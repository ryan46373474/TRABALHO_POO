class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$" + preco);
        System.out.println("-------------------------");
    }
}

public class ProjetoLivraria {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien", 59.90);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 39.50);

        livro1.setPreco(49.90);
        livro2.setTitulo("Dom Casmurro - Edição Especial");

        System.out.println("== Antes do desconto ==");
        livro1.exibirInfo();
        livro2.exibirInfo();

        livro1.aplicarDesconto(10);
        livro2.aplicarDesconto(5);

        System.out.println("== Depois do desconto ==");
        livro1.exibirInfo();
        livro2.exibirInfo();
    }
}