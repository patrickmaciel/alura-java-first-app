package meu.pacote;

import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;

        System.out.print("Digite um número: ");
        numeroDigitado = scanner.nextInt();

        if (numeroDigitado > 0) {
            System.out.println("O número digitado é positivo!");
        } else if (numeroDigitado < 0) {
            System.out.println("O número digitado não é positivo!");
        } else {
            System.out.println("O número digitado é zero!");
        }
    }
}
