package meu.pacote;

import java.util.Scanner;

class ConvertendoValores {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        int celsius = scanner.nextInt();
        int fahrenheit1 = (celsius * 9 / 5) + 32;
        int fahrenheit2 = (int) ((celsius * 1.8) + 32);
        System.out.println("A temperatura em Fahrenheit 1 é: " + fahrenheit1);
        System.out.println("A temperatura em Fahrenheit 2 é: " + fahrenheit2);
    }
}
