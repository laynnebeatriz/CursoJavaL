package ExerAula16e17;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;
        String nomeUser;
        String senha;

        do {
            System.out.println("Entre com o  nome do usuario:");
            nomeUser = scan.next();

            System.out.println("Entre com a senha:");
            senha = scan.next();

            if (nomeUser.equalsIgnoreCase(senha)){
                //infoValidas = false;
                System.out.println("Senha igual ao usuario, digite novamente:");
            } else {
                infoValidas = true;
                System.out.println("Senha e ususarios validos.");
            }
        } while (!infoValidas);
    }
}
