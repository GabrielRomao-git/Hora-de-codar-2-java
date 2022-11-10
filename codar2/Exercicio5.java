import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] n;
        n = new int[4];
        int u = 0;
        double acumula = 0;

        for(int i = 0; i < 4; i++) {
            System.out.println("Digite um valor?");
            n[u] = ler.nextInt();
            acumula += n[ i ];
            u++;
        }
        double conta = acumula /4;

        if(conta >=6) {
            System.out.println("Parabens aprovadinhuuuuuu, com a nota: " + conta);
        } else {
            System.out.println("Reprovado com a nota: " + conta);
        }
        
    }
}