package Aula29;

public class TesteCarro29 {
    public static void main(String[] args) {

        Carro29 van = new Carro29();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        //van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.numPassageiros);

        Carro29 van2 = new Carro29("Fiat", "Ducato", 10, 100, 0.2);

        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numPassageiros);
        System.out.println(van2.capCombustivel);
        System.out.println(van2.consumoCombustivel);

    }
}
