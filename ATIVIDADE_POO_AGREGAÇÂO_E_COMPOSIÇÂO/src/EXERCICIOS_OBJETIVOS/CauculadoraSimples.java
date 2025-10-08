package EXERCICIOS_OBJETIVOS;
import javax.swing.JOptionPane;

public class CalculadoraSimples {

    public static void main(String[] args) {
        try {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

            String[] opcoes = {"+", "-", "×", "÷"};
            int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha a operação:",
                "Calculadora Simples",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            double resultado = 0;
            boolean operacaoValida = true;

            switch (escolha) {
                case 0:
                    resultado = num1 + num2;
                    break;
                case 1:
                    resultado = num1 - num2;
                    break;
                case 2:
                    resultado = num1 * num2;
                    break;
                case 3:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
                        operacaoValida = false;
                    } else {
                        resultado = num1 / num2;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação cancelada!");
                    operacaoValida = false;
            }

            if (operacaoValida) {
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Entrada inválida! Digite apenas números.");
        }
    }
}
