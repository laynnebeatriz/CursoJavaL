package Vetores;

import java.util.Scanner;

public class Aula19Exerc15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }
        int impar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                impar++;
            }
        }
        int par = vetorA.length - impar;
        double porPar = (par * 100) /vetorA.length;
        double porImpar = 100 - porPar;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Porcentagem Pares: " + porPar);
        System.out.println("Porcentagem Impares: " + porImpar);
    }
}
