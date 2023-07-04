package Geometry;

import javax.swing.*;

public class Circulo {
    static float PI = 3.14f;
    static int raio;

    static void insiraRaio(){
        String input = JOptionPane.showInputDialog("Digite o raio");
        raio = Integer.parseInt(input);
    }

    static void exibeArea(){
        JOptionPane.showMessageDialog(null,"A área do círculo é: " + PI * (raio * raio));
    }

    public static void main(String[] args) {
        insiraRaio();
        exibeArea();
    }
}
