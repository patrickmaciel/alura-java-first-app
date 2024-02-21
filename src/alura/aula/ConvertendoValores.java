package alura.aula;

public class ConvertendoValores {
    public static void main(String[] args) {
        double media = 8.132;
        int classificacao = (int) (media / 2);
        System.out.println(String.format("A classificação é %d", classificacao));
    }
}
