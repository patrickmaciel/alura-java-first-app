package alura.aula;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDeLancamento > 2022) {
            System.out.println("Lançamenot que os clientes estão curtindo");
        } else {
            System.out.println("Filme antigo demais, não é mais interessante para os clientes");
        }

        if (incluidoNoPlano || tipoPlano.equals("Plus")) {
            System.out.println("Este filme está incluído no plano ou é do tipo Plus");
        } else {
            System.out.println("Este filme não está incluído no plano e não é do tipo Plus");
        }

        if (notaDoFilme >= 8.0 && anoDeLancamento >= 2024) {
            System.out.println("Corre para assistir que é um filme muito bom");
        } else {
            System.out.println("Você pode assistir outro filme, este está com a nota baixa");
        }

        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda";
                break;
            case 3:
                nomeDia = "Terça";
                break;
            case 4:
                nomeDia = "Quarta";
                break;
            case 5:
                nomeDia = "Quinta";
                break;
            case 6:
                nomeDia = "Sexta";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia da semana é: " + nomeDia);
    }
}
