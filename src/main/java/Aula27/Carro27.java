package Aula27;

public class Carro27 {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "Km");
    }

    double obterAutonomia() {

        System.out.println("Metodo obterAutonomia foi chamado.");

        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
}
