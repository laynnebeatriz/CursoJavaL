package ExerAula16e17;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com um numero:");
            num = scan.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("pares: " + pares);
        System.out.println("impares: " + impares);
    }
}
