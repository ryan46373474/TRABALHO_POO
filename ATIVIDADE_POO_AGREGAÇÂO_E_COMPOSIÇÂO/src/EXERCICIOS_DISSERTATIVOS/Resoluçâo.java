package EXERCICIOS_DISSERTATIVOS;
public class Resolução {

    // 1) Exemplos de Agregação e Composição
    // Agregação: relação fraca (objetos independentes)
    class Escola {
        Professor professor; // Escola tem Professor, mas Professor existe sozinho
    }

    class Time {
        Jogador jogador; // Time tem Jogador, mas Jogador pode existir fora do time
    }

    // Composição: relação forte (dependência total)
    class Carro {
        Motor motor = new Motor(); // Se Carro deixar de existir, o Motor também
    }

    class Casa {
        Comodo comodo = new Comodo(); // Comodo depende da Casa
    }

    // Classes de exemplo usadas acima
    class Professor {}
    class Jogador {}
    class Motor {}
    class Comodo {}

    // 2) Classe ou atributo final
    final class Utilidade {} // não pode ser herdada

    class ExemploFinal {
        final int numero = 10; // valor não pode ser alterado
        // numero = 20; // ERRO!
    }

    // 3) Método estático
    static void saudacao() {
        System.out.println("Olá! Método chamado sem criar objeto.");
    }

    // 4) Métodos da classe Object
    public static void main(String[] args) {
        // Chamando método estático
        saudacao();

        // Métodos da classe Object
        Object obj = new Object();
        System.out.println(obj.hashCode()); // Retorna código hash do objeto
        System.out.println(obj.getClass()); // Retorna a classe do objeto
    }
}
