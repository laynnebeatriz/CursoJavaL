package aula13;

import java.util.Scanner;

public class Labs8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora ");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com o a quantidade de horas trabalhadas no mês");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;
        System.out.println("O salario é de:" + salario);
    }
}
