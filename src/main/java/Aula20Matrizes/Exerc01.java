package Aula20Matrizes;

import java.util.Random;
import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);

        int[][] numerosAleatorios = new int[4][4];

        Random numerosRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios.length; j++) {
                numerosAleatorios[i][j] = numerosRandom.nextInt(100);
            }
        }
        int maior = 0;
        int linha = 0;
        int col = 0;
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios.length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }
        }
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios.length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Linha " + linha);
        System.out.println("Coluna " + col);
    }
}
