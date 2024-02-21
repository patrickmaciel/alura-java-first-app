package alura.aula;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String nomeFilme = scanner.nextLine();

        System.out.print("Qual ano de lançamento do filme? ");
        int anoLancamento = scanner.nextInt();

        System.out.print("Qual sua avaliação para esse filme? ");
        double avaliacao = scanner.nextDouble();
    }
}
