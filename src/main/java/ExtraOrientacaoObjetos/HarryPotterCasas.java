package ExtraOrientacaoObjetos;

public class HarryPotterCasas {
    public static void main(String[] args) {

        CasasHP casa = new CasasHP();
        casa.nomeCasa = "Sonserina";
        casa.simboloDaCasa = "Serpente";
        casa.cor = "Verde e Prata";
        casa.fundador = "Salazar Slytherin";

        System.out.println("Nome da Casa = " + casa.nomeCasa);
        System.out.println("Fundador = " + casa.fundador);
    }
}
