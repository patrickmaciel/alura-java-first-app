package meu.pacote;

public class MediaDecimal {
    public static void main(String[] args) {
        double numeroUm = 52.12;
        int numeroDois = 35;
        int mediaUm = (int) (numeroUm + numeroDois) / 2;
        System.out.println("A média é: " + mediaUm);

        char letraA = 'A';
        String palavra = "Palavrinha";
        System.out.println(String.format("A letra %c é a primeira letra da palavra %s", letraA, palavra));
    }
}
