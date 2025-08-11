package Aula24Exercicio;

import java.util.Date;

public class VendaLivroDeBiblioteca {
    public static void main(String[] args) {

        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Beatriz";

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Emprestado = " + livro.emprestadoA);
        System.out.println("Data = " + livro.dataEntrega);
    }
}
