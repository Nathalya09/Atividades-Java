package While;

import javax.swing.*;

public class While {
    static int n1;
    static int n2;

    static void insiraN1(){
        String input = JOptionPane.showInputDialog("Digite um valor");
        n1 = Integer.parseInt(input);
    }

    static void insiraN2(){
        String input = JOptionPane.showInputDialog("Digite um valor");
        n2 = Integer.parseInt(input);
    }

    public static void main(String[] args) {
        insiraN1();
        
        while (n2 <= 0) {
            insiraN2();
            
            if (n2 <= 0) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Digite outro valor maior que zero.");
            }
        }

        double resultado = (double) n1 / n2;
        JOptionPane.showMessageDialog(null, "Resultado da divisão: " + resultado);
    }   
}
