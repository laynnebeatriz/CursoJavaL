package aula15;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com segundo numero: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com terceiro numero: ");
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 é maior: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("num2 é maior: " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("num3 é maior: " + num3);
        }

        System.out.println("Entre com primeiro numero: ");
        int num4 = scan.nextInt();

        System.out.println("Entre com segundo numero: ");
        int num5 = scan.nextInt();

        System.out.println("Entre com terceiro numero: ");
        int num6 = scan.nextInt();

        if (num4 <= num5 && num1 <= num6) {
            System.out.println("num4 é menor: " + num4);
        } else if (num5 <= num1 && num5 <= num6) {
            System.out.println("num5 é menor: " + num5);
        } else if (num6 <= num1 && num6 <= num5) {
            System.out.println("num6 é menor: " + num6);
        }


    }
}
