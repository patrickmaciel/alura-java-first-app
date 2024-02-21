package alura.aula;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite sua avaliação para o filme: ");
            nota = scanner.nextDouble();
            mediaAvaliacao += nota;
        }

        mediaAvaliacao /= 3;
        System.out.println("A média das avaliações é: " + mediaAvaliacao);
    }
}
