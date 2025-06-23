package ExerAula16e17;

import java.util.Scanner;

public class Exerc32 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de n: ");
        int n = scan.nextInt();
        double soma = 0;

        for (int i=1, j=1; i<=n; j += 2, i++){
            System.out.print(i + "/" + j + " + ");

            soma += i/j;
        }
        System.out.println("\nSoma: " + soma);
    }
}
