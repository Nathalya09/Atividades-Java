package Geometry;

import javax.swing.*;

public class Quadrado {
    static int lado;

    static void insiralado(){
        String input = JOptionPane.showInputDialog("Digite o lado");
        lado = Integer.parseInt(input);
    }

    static void exibeArea(){
        JOptionPane.showMessageDialog(null,"A área do quadrado é: " + lado * lado);
    }

    public static void main(String[] args) {
        insiralado();
        exibeArea();
    }
}
