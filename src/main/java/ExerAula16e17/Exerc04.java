package ExerAula16e17;

public class Exerc04 {
    public static void main(String[] args) {

        int popA = 80000;
        int popB = 200000;
        int cont = 0;

        while (popA < popB){
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            cont++;
        }
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtd anos:    " + cont);
    }
}
