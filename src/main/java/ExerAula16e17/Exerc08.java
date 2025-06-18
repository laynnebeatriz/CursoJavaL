package ExerAula16e17;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        double media;
        int soma = 0;

        for (int i=0; i < 5; i++){
            System.out.println("Digite um numero:");
            num = scan.nextInt();

            soma += num;
        }
        media = soma / 5;
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}
