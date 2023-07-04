package Information;

import javax.swing.*;

public class NomeIdade {
    static String nome;
    static int idade;

    static void insiraNome(){
        nome = String.format(JOptionPane.showInputDialog("Qual é o seu nome?"));
    }

    static void insiraIdade() {
        String input = JOptionPane.showInputDialog("Digite sua idade");
        idade = Integer.parseInt(input);
    }

    static void exibeNomeIdade(){
        JOptionPane.showMessageDialog(null, "Olá, " + nome + ", sua idade é " + idade);
    }

    public static void main(String[] args) {
        insiraNome();
        insiraIdade();
        exibeNomeIdade();
    }
}