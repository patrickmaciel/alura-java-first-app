package meu.pacote;

import java.util.Random;
import java.util.Scanner;

public class AdvinhaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;
        int numeroAleatorio = new Random().nextInt(100);

        System.out.println("Digite abaixo um número entre 0 e 100 e veja se você acerta o número que estou pensando: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeroDigitado = scanner.nextInt();

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número que eu estava pensando!");
                break;
            } else if (numeroDigitado > numeroAleatorio) {
                System.out.println("O número que estou pensando é menor que " + numeroDigitado);
            } else {
                System.out.println("O número que estou pensando é maior que " + numeroDigitado);
            }
        }
    }
}
