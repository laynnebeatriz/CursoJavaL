package ExerAula16e17;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o e-nesimo termo da serie de fibonacci: ");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        //1,1,2,3,5
        //primeiro=1
        //segundo=2
        //proximo=3

        for (int i = 3; i <= n; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }
    }
}
