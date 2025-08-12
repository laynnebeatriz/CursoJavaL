package Aula26;

public class TesteCarro26 {
    public static void main(String[] args) {

        Carro26 van = new Carro26();
        van.marca = "Fiat";
        van.modelo = "Ducate";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        System.out.println("A autonomia do carro é: " + van.obterAutonomia());
    }
}
