package meu.pacote;

import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número para calcular o fatorial:");
        numero = scanner.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
