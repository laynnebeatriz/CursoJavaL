package com.laynne;

import java.util.Locale;
import java.util.Scanner;

public class Aula12LeituraDadosTeclado {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

//        System.out.println("Digite seu nome completo: ");
//        String nomeCompleto = scan.nextLine();
//        System.out.println("Seu nome completo é: " + nomeCompleto);
//
//        System.out.println("Digite seu primeiro nome: ");
//        String primeiroNome = scan.next();
//        System.out.println("Seu primeiro nome é: " + primeiroNome);
//
//        System.out.println("Digite a sua idade: ");
//        int idade = scan.nextInt();
//        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação: ");
        String primeiroNome2 = scan.next();
        int idade2 = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temBichinho = scan.nextBoolean();

        System.out.println("Voce digitou os seguintes valores:");
        System.out.println("Primeiro nome:" + primeiroNome2);
        System.out.println("Idade:" + idade2);
        System.out.println("Quantidade de filhos:" + qtdFilhos);
        System.out.println("Altura:" + altura);
        System.out.println("Tem bichinho:" + temBichinho);
    }
}
