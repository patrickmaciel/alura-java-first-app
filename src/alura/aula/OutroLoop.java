package alura.aula;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.print("Digite sua avaliação para o filme ou -1 para encerrar: ");
            nota = scanner.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        if (totalDeNotas > 0) {
            mediaAvaliacao /= totalDeNotas;
            System.out.println("A média das avaliações é: " + mediaAvaliacao);
        }
    }
}
