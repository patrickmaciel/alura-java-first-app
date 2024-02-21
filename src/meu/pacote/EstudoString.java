package meu.pacote;

import java.util.Scanner;

public class EstudoString {
    public static void main (String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Digite a senha: ");
        // String senha = scanner.nextLine();
        String senha = "asdfasdf";

        if (senha.length() < 5) {
            System.out.println("Senha muito curta");
        }

        if (senha.equals("asdfasdf")) {
            System.out.println("Senha correta");
        } else {
            System.out.println("Senha incorreta");
        }

        String mensagem = """
                Olá, tudo bem?
                Como você está?
                """;
        System.out.println(mensagem);
        System.out.println("------------------------------");

        formattingText(args);
        System.out.println("------------------------------");
        formattingTextBlock(args);
    }

    public static void formattingText(String[] args) {
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9123;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
    }

    public static void formattingTextBlock(String[] args) {
        String nome = "Maria";
        int aulas = 30;
        double valor = 55.9123;
        System.out.println("""
                Olá, %s!
                Boas vidas ao curso de Java.
                Teremos %d aulas para te mostrar o que é possível fazer com %.2f reais.
                """.formatted(nome, aulas, valor));
    }
}
