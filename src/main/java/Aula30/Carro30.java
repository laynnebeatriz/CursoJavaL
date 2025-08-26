package Aula30;

public class Carro30 {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    public Carro30(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro30() {}

    public Carro30(String modelo, String marca, int numPassageiros) {
        this.modelo = modelo;
        this.marca = marca;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parametros");
    }

    public Carro30(String marca, String modelo) {
        this(marca, modelo,10);
        System.out.println("Chamando o construtor com 2 parametros");
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "Km");
    }

    double obterAutonomia() {

        System.out.println("Metodo obterAutonomia foi chamado.");

        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {

        double qtdCombustivel = km /this.consumoCombustivel;

        return qtdCombustivel;
    }
}
