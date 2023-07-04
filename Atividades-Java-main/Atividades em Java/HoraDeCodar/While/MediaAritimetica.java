package While;

import javax.swing.*;

public class MediaAritimetica {
    public static void main(String[] args) {
        int quantidadeValores = 10;
        int[] valores = new int[quantidadeValores];
        int soma = 0;

        for (int i = 0; i < quantidadeValores; i++) {
            String input = JOptionPane.showInputDialog("Digite um valor");
            int valor = Integer.parseInt(input);
            valores[i] = valor;
            soma += valor;
        }

        double media = (double) soma / quantidadeValores;

        StringBuilder numerosInformados = new StringBuilder("Números informados: ");
        for (int i = 0; i < quantidadeValores; i++) {
            numerosInformados.append(valores[i]);
            if (i != quantidadeValores - 1) {
                numerosInformados.append(", ");
            }
        }

        String resultado = numerosInformados.toString() + "\nMédia aritmética: " + media;
        JOptionPane.showMessageDialog(null, resultado);
    }
}
