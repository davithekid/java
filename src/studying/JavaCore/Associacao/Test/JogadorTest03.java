package studying.JavaCore.Associacao.Test;

import studying.JavaCore.Associacao.Dominio.Jogador;
import studying.JavaCore.Associacao.Dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Messi");
        Time time = new Time("Liquid");
        Jogador[] jogadores = {jogador, jogador2};
        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

//        pov jogador
        System.out.println("----Jogador-----");
        jogador.imprime();
        jogador2.imprime();

        // pov time
        System.out.println("----Time-----");
        time.imprime();
    }
}
