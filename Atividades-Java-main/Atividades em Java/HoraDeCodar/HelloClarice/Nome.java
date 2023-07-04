package HelloClarice;

import javax.swing.*;

public class Nome {

    static String nome;

    static void insiraNome(){
        nome = String.format(JOptionPane.showInputDialog("Qual é o seu nome?"));
    }

    static void exibeNome(){
        JOptionPane.showMessageDialog(null, "Olá, " + nome);
    }

    public static void main(String[] args) {
        insiraNome();
        exibeNome();
    }
}
