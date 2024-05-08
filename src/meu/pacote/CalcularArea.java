package meu.pacote;

import java.util.Scanner;

public class CalcularArea {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int opcao, base, altura, raio;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Calcular área do quadrado");
            System.out.println("2 - Calcular área do círculo");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do lado do quadrado:");
                    base = scanner.nextInt();
                    System.out.println("A área do quadrado é: " + (base * base));
                    break;
                case 2:
                    System.out.println("Digite o valor do raio do círculo:");
                    raio = scanner.nextInt();
                    System.out.println("A área do círculo é: " + (3.14 * raio * raio));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println("");
        } while (opcao != 0);
    }
}
