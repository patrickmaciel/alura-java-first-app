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

        double precoProduto = 7.59;
        int quantidade = 30;
        double total = precoProduto * quantidade;
        System.out.println(String.format("O total é R$ %.2f", total));

        double valoremDolares = 99;
        double cotacaoDolar = 4.94;
        double valorEmReais = valoremDolares * cotacaoDolar;
        System.out.println(String.format("%.2f dolares equivale a R$ %.2f", valoremDolares, valorEmReais));

        double precoOriginal = 100;
        double percentualDesconto = 25;
        double valorDesconto = precoOriginal * percentualDesconto / 100;
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.println(String.format("O desconto foi de R$ %.2f e o preço com desconto é R$ %.2f", valorDesconto, precoComDesconto));
    }
}
