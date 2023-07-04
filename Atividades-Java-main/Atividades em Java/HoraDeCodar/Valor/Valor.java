package Valor;

import javax.swing.*;

public class Valor {
    static int valor;
    static int resultado;

    static void insiraValor(){
        String input = JOptionPane.showInputDialog("Digite um valor");
        valor = Integer.parseInt(input);
    }

    static void exibeResultado(){
        if(valor > 0){
            JOptionPane.showMessageDialog(null,"O valor informado é positivo!");
        } else if (valor < 0){
            JOptionPane.showMessageDialog(null,"O valor informado é negativo!");
        } else {
            JOptionPane.showMessageDialog(null,"O valor informado é neutro!");
        }
    }

    public static void main(String[] args) {
        insiraValor();
        exibeResultado();
    }
}
