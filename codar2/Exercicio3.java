import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         System.out.println("Qual o primeiro valor?");
        int um = ler.nextInt();
        System.out.println("Qual o segundo valor?");
        int dois = ler.nextInt();
        System.out.println("Qual o terceiro valor?");
        int tres = ler.nextInt();

        int conta = Math.min(um, Math.min(dois, tres));

        System.out.println("O resultado e de: " + (um + dois + tres - conta));
    }
}