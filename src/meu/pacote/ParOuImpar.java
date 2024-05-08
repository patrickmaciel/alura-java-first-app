package meu.pacote;

import java.util.Scanner;

public class ParOuImpar {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número para saber se é par ou ímpar:");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
