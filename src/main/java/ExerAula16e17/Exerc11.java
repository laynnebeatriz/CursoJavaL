package ExerAula16e17;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero: ");
        int num2 = scan.nextInt();

        int soma = 0;

        for (int i = num1; i <= num2; i++) {
         soma += i;
        }
        System.out.println("soma: " + soma);
    }
}
