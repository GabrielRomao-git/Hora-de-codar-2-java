import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o primeiro valor?");
        int um = ler.nextInt();
        System.out.println("Qual o segundo valor?");
        int dois = ler.nextInt();
        System.out.println("Qual o terceiro valor?");
        int tres = ler.nextInt();

        System.out.println("O maior valor é:" + Math.max(um, Math.max(dois, tres)));
    }
}