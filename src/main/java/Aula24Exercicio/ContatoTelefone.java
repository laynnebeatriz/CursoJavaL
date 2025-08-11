package Aula24Exercicio;

public class ContatoTelefone {
    public static void main(String[] args) {

        Contato contato1 = new Contato();
        contato1.nome = "Joao";
        contato1.endereco = "Av Paulista, 1000";
        contato1.email = "joao@email.com";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "99999-9999";
        contato1.telefones[1] = "99999-9998";
        contato1.telefones[2] = "99999-9997";

        System.out.println("Nome do contato = " + contato1.nome);
        System.out.println("Email = " + contato1.email);
        System.out.println("Telefone = " + contato1.telefones[1]);
    }
}
