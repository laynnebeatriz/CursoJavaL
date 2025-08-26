package Aula29;

public class Carro29 {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro29(){
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }

    Carro29(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = capCombustivel_;
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "Km");
    }

    double obterAutonomia() {

        System.out.println("Metodo obterAutonomia foi chamado.");

        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {

        double qtdCombustivel = km / consumoCombustivel;

        return qtdCombustivel;
    }
}
