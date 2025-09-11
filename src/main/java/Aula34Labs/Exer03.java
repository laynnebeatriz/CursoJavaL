package Aula34Labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;

        do{
            System.out.println("Entre com um nuemero positivo");
            num = scan.nextInt();

            if (num < 0){
                System.out.println("Numero invalido");
            }
        } while (num < 0);
    }
}
