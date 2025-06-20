package ExerAula16e17;

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a base");
        int base = scan.nextInt();

        System.out.println("Entre com a potência");
        int pot = scan.nextInt();

        int resultado = base;

        for (int i = 1; i < pot; i++){
            resultado *= base;
        }
        System.out.println("resultado: " + resultado);

    }
}
