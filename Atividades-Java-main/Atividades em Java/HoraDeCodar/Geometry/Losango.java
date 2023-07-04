package Geometry;

import javax.swing.*;

public class Losango {
    static int diagonal_maior;
    static int diagonal_menor;

    static void insiraMaior(){
        String input = JOptionPane.showInputDialog("Digite a diagonal maior");
        diagonal_maior = Integer.parseInt(input);
    }

    static void insiraMenor(){
        String input = JOptionPane.showInputDialog("Digite a diagonal menor");
        diagonal_menor = Integer.parseInt(input);
    }

    static void exibeArea(){
        JOptionPane.showMessageDialog(null,"A área do losango é: " + diagonal_maior * diagonal_menor / 2);
    }

    public static void main(String[] args) {
        insiraMaior();
        insiraMenor();
        exibeArea();
    }
}
