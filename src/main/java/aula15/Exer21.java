package aula15;

import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de litros vendidos: ");
        double litros = scan.nextDouble();

        System.out.println("Entre com o tipo de combustivel:");
        String tipo = scan.next();

        double precoGas = 2.50;
        double precoAlc = 1.90;
        int percDesconto = 0;
        double total = 0;
        double totalDesconto = 0;

        if (tipo.equalsIgnoreCase("a")){

            if (litros <= 20){
                percDesconto = 3;
            } else {
                percDesconto = 5;
            }
            total = litros * precoAlc;

        } else if (tipo.equalsIgnoreCase("g")){
            if (litros <= 20){
                percDesconto = 4;
            } else {
                percDesconto = 6;
            }
            total = litros * precoGas;
        }
        totalDesconto = (total / 100) * percDesconto;

       double precoAPagar = total - totalDesconto;
       System.out.println("Valor a ser pago: " + precoAPagar);

    }
}
