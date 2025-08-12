package Aula25;

public class Carro25 {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){

        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "Km");
    }
}
