package ExerAula16e17;

import java.util.Scanner;

public class Exerc25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //System.out.println("Lojas Tabajara");

        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago, troco;

        do {
            System.out.println("Deseja infomar uma nova compra? S/N");
            continuarCompra = scan.next();

            if (continuarCompra.equals("S")) {

                output = "Lojas Tabajara\n";

                System.out.println("Digite a quantidade de produtos da compra:");
                qtdProdutos = scan.nextInt();

                total = 0;

                for (int i = 0; i <= qtdProdutos; i++) {
                    System.out.println("Informe o preço do produto " + i);
                    preco = scan.nextDouble();
                    total += preco;
                    output += "Produto" + i + " : R$ " + preco + "\n";
                }
                output += "Total: R$" + total;

                System.out.println("Total: R$" + total);

                System.out.println("Entre com o valor pago");
                valorPago = scan.nextDouble();

                output += "Dinheiro: R$" + valorPago + "\n";

                troco = total - valorPago;

                output += "Troco: R$" + troco;

                System.out.println(output);

            } else {
                sair = true;
            }

        } while (!sair);
    }
}
