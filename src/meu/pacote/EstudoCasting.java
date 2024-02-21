package meu.pacote;

public class EstudoCasting {
    public static void main(String[] args) {
        System.out.println("Casting implicito: int para double");
        int numeroInteiro = 10;
        double numeroDouble = numeroInteiro;
        System.out.println("Int para Double: " + numeroDouble);
        System.out.println("------------------------------");

        System.out.println("Casting explicito: double para int");
        double x = 10.5;
        int y = (int) x;
        System.out.println("Double para Int: " + y);
        System.out.println("------------------------------");
    }
}
