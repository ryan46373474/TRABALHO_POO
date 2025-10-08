package EXERCICIOS_OBJETIVOS
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    class ItemPedido {
        String nome;
        int quantidade;
        double precoUnitario;

        public ItemPedido(String nome, int quantidade, double precoUnitario) {
            this.nome = nome;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        double subtotal() {
            return quantidade * precoUnitario;
        }
    }

    List<ItemPedido> itens = new ArrayList<>();

    void adicionarItem(String nome, int quantidade, double precoUnitario) {
        itens.add(new ItemPedido(nome, quantidade, precoUnitario));
    }

    double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.subtotal();
        }
        return total;
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Teclado", 2, 150);
        pedido.adicionarItem("Mouse", 1, 80);
        System.out.println("Valor total do pedido: R$ " + pedido.valorTotal());
    }
}
