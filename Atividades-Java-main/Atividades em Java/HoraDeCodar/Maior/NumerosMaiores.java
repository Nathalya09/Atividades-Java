package Maior;

import javax.swing.*;

public class NumerosMaiores {
    static int n1;
    static int n2;
    static int n3;
    static int n4;

    static void insiraN1(){
        String input = JOptionPane.showInputDialog("Digite um valor");
        n1 = Integer.parseInt(input);
    }

    static void insiraN2(){
        String input = JOptionPane.showInputDialog("Digite um valor");
        n2 = Integer.parseInt(input);
    }

    static void insiraN3(){
        String input = JOptionPane.showInputDialog("Digite um valor");
        n3 = Integer.parseInt(input);
    }
    static void insiraN4(){
        String input = JOptionPane.showInputDialog("Digite um valor");
        n4 = Integer.parseInt(input);
    }

    static void exibeResultado(){
        if(n1 > n2 && n1 > n3 && n1 > n4){
            JOptionPane.showMessageDialog(null,"O primeiro é o maior!");
        } else if(n2 > n1 && n2 > n3 && n2 > n4){
            JOptionPane.showMessageDialog(null,"O segundo é o maior!");
        } else if(n3 > n1 && n3 > n2 && n3 > n4){
            JOptionPane.showMessageDialog(null,"O terceiro é o maior!");
        } else{
            JOptionPane.showMessageDialog(null,"O quarto é o maior!");
        }
    }

    public static void main(String[] args) {
        insiraN1();
        insiraN2();
        insiraN3();
        insiraN4();
        exibeResultado();
    }
}
