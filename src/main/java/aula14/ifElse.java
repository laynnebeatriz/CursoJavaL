package aula14;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        Scanner san = new Scanner(System.in);

        /*System.out.println("Entre com sua idade");
        int idade = san.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else
            System.out.println("Não é maior de idade");
    }*/

        //barato <= 10
        //10 < valor < 15 - pedir desconto
        //15 <= valor 17 - pesquisar mais
        // >= 17 - muito caro

        System.out.println("Entre com o preço do item");
        double valor = san.nextDouble();

        if (valor <= 10){
            System.out.println("Esta barato, pode comprar");

        } else if (valor > 10 && valor < 15){
            System.out.println("Voce pode pedir um desconto");
        } else if (valor >= 15 && valor < 17){
            System.out.println("Pode pesquisar mais");
        } else { // >= 17
            System.out.println("Muito caro");
        }
    }
}
