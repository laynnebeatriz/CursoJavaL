package aula13;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;  //% - molde e o valor do resto da divisao//
        System.out.println(resultado);

        String primeiroNome = "Esta e";
        String segundoNome = "uma String concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;  // ++ significa que esta sendo adicionado 1//
        System.out.println(resultado);

        System.out.println(resultado++);
        System.out.println(++resultado);




    }
}
