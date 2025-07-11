package Vetores;

import java.util.Scanner;

public class Aula19Exerc22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com um numero para a posição " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0) {
                break;
            }
        }


    }
}
