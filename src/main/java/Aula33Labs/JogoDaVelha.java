package Aula33Labs;

public class JogoDaVelha {

    private char[][] jogoVelha = new char[3][3];
    private int jogada = 1;

    public JogoDaVelha(){
        setJogoVelha(new char[3][3]);
        setJogada(1);
    }

    public char[][] getJogoVelha() {
        return jogoVelha;
    }

    public void setJogoVelha(char[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public boolean validarJogada(int linha, int coluna, char sinal){

        if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == '0'){
            return false;

        } else { //jogada Valida
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }
    public void imprimirTabuleiro(){
        for (int i = 0; i < jogoVelha.length; i++){
            for (int j = 0; j < jogoVelha[i].length; j++){
                System.out.println(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }
    public boolean verificarGanhador(char sinal){

        if((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha [0][2] == sinal) ||  //linha1
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha [1][2] == sinal) ||  //linha2
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha [2][2] == sinal) ||  //linha3
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha [2][0] == sinal) ||  //coluna1
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha [2][1] == sinal) ||  //coluna2
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha [2][2] == sinal) ||  //coluna3
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha [2][2] == sinal)){  //diagonal

            return true;
        }
        return false;
    }
    public boolean vezJogador1(){
        if  (jogada % 2 == 1){
            return true;
        }
        return false;
    }
}
