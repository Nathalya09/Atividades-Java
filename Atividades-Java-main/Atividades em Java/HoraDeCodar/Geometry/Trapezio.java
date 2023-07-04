package Geometry;

import javax.swing.*;

public class Trapezio {
    static int base_maior;
    static int base_menor;
    static int altura;

    static void insiraBaseMaior(){
        String input = JOptionPane.showInputDialog("Digite a base maior");
        base_maior = Integer.parseInt(input);
    }

    static void insiraBaseMenor(){
        String input = JOptionPane.showInputDialog("Digite a base menor");
        base_menor = Integer.parseInt(input);
    }

    static void insiraAltura(){
        String input = JOptionPane.showInputDialog("Digite a altura");
        altura = Integer.parseInt(input);
    }

    static void exibeArea(){
        JOptionPane.showMessageDialog(null,"A área do losango é: " + (base_maior + base_menor) * altura / 2);
    }

    public static void main(String[] args) {
        insiraBaseMaior();
        insiraBaseMenor();
        insiraAltura();
        exibeArea();
    }
}
