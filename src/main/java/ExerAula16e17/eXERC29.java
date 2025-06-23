package ExerAula16e17;

import java.util.Scanner;

public class eXERC29 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o numero para gerar a tabuada: ");
        int num = scan.nextInt();

        boolean invalido = false;
        int numFinal, numInicio;

        do {
            System.out.println("Entre com o inicio da tabuada");
            numInicio = scan.nextInt();

            System.out.println("Entre com o final da tabuada");
            numFinal = scan.nextInt();

            if (numFinal < numInicio) {
                invalido = true;
            }

            }
            while (invalido) ;

            System.out.println("Tabuada de:" + num + ":");
            System.out.println("Começa por:" + numInicio);
            System.out.println("Terminar em:" + numFinal);
            System.out.println();

            for (int i = numInicio; i <= numFinal; i++) {
                System.out.print(num + " x " + i + " = " + (num * 1));

            }
        }
    }

