import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] n;
        n = new int[10];
        int u = 0;
        double conta = 0;

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite um valor?");
            n[u] = ler.nextInt();
            conta += n[ i ];
            u++;
        }
        System.out.println("A media é de: " + (conta / 10));
    }
}