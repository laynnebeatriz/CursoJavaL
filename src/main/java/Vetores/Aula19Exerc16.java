package Vetores;

import java.util.Scanner;

public class Aula19Exerc16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }
        int somaMenor15 = 0;
        int SomaMaior15 = 0;
        int qtdMaior15 = 0;
        int igual15 = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 15){
                igual15++;
            } else if (vetorA[i] < 15) {
                somaMenor15 += vetorA[i];
            } else {
                qtdMaior15++;
                SomaMaior15 += vetorA[i];
            }
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Qtd numeros == 15: " + igual15);
        System.out.println("Soma numeros < 15: " + somaMenor15);
        System.out.println("Media numeros > 15: " + (SomaMaior15/qtdMaior15));
    }
}
