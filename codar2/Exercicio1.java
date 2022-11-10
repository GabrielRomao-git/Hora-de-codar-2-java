import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("COloque um valor:");
           int  numero = ler.nextInt();
           if(numero > 0) {
               System.out.println("O valor é positivo");
           } else if(numero < 0) {
               System.out.println("O valor é negativo");
           } else {
               System.out.println("O valor é 0");
           }
    }
}