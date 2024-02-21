package alura.aula;

import javax.management.monitor.GaugeMonitor;

public class AtribuindoValores {
    public static void main(String[] args) {
        System.out.println("Esse é o screen watch");
        System.out.println("Filme: top gun maverick");

        int ano = 2022;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("A média é: " + media);

        String sinopse;
        // sinopse = "Filme de aventura com galã dos anos 80";
        sinopse = """
                Filme Top GaugeMonitorFilme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + ano;
        System.out.println("Sinopse: " + sinopse);
        System.out.println();
        System.out.println();
    }
}
