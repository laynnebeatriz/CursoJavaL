package ExerAula16e17;

import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num = scan.nextInt();

        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é primo");
                primo = false;
            }
        }
        if (primo) {
            System.out.println(primo);
        }

    }
}
