package Vetores;

import java.util.Scanner;

public class Aula19Exerc23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com um numero para a posição " + i);
            vetorA[i] = scan.nextInt();
        }


        boolean palindro = true;
        for (int i = 0; i < (vetorA.length/2); i++) {
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                palindro = false;
                break;
            }
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        if (palindro){
            System.out.println("Palindro");
        } else {
            System.out.println("Não é palindro");
        }
    }
}
