package aula13;

import java.util.Scanner;

public class Labs3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero: ");
        int num2 = scan.nextInt();

        int resultado = num1+num2;
        System.out.println("A soma dos numeros e: " + resultado);
    }
}
