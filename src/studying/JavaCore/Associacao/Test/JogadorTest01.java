package studying.JavaCore.Associacao.Test;

import studying.JavaCore.Associacao.Dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("CR7");
        Jogador jogador3 = new Jogador("Neymar");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
}
