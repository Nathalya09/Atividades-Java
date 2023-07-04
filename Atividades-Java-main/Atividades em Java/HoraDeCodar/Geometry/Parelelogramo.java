package Geometry;

import javax.swing.*;

public class Parelelogramo {
    static int base;
    static int altura;
    
    static void insiraBase(){
        String input = JOptionPane.showInputDialog("Digite a base");
        base = Integer.parseInt(input);
    }

    static void insiraAltura(){
        String input = JOptionPane.showInputDialog("Digite a altura");
        altura = Integer.parseInt(input);
    }

    static void exibeArea(){
        JOptionPane.showMessageDialog(null,"A área do paralelogramo é: " + base * altura);
    }

    public static void main(String[] args) {
        insiraBase();
        insiraAltura();
        exibeArea();
    }
}
