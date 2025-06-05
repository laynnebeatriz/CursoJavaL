package aula15;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com a operacao (+ - / *): ");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num1 / num2; break;
            default: System.out.println("Operação inválida"); valida = false;
        }
        if (valida){
            System.out.println("Resultado: " + resultado);

            if (resultado >= 0){
                System.out.println("Resultado Positivo");
            } else {
                System.out.println("Resultado Negativo");
            }
            if (resultado % 2 == 0){
                System.out.println("Resultado par");
            } else {
                System.out.println("Resultado impar");
            }
        }
    }
}
