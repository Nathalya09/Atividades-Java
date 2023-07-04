package Maiores;

import java.util.*;

public class MaioresNumeros {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite o valor " + (i + 1) + ": ");
                int valor = scanner.nextInt();
                valores.add(valor);
            }
        }

        int soma = valores.stream()
                .sorted((a, b) -> b.compareTo(a))
                .limit(2)
                .reduce(0, Integer::sum);

        System.out.println("A soma dos dois maiores valores é: " + soma);
    }   
}
