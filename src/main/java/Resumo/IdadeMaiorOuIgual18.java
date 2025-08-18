package Resumo;

import java.util.Scanner;

public class IdadeMaiorOuIgual18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade = 20;

        if (ehMaiorDeIdade(idade)) {

            System.out.println("Maior idade");
        } else{
            System.out.println("Menor idade");
        }
    }


    public static Boolean ehMaiorDeIdade(int idade) {
        Boolean ehMaiorDeIdade = idade >= 18;
        return ehMaiorDeIdade;
    }
}
