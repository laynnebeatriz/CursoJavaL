package Aula25;

public class TesteCarro25 {
    public static void main(String[] args) {

        Carro25 van = new Carro25();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();
    }
}
