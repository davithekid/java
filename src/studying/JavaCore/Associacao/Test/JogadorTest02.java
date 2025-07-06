package studying.JavaCore.Associacao.Test;

import studying.JavaCore.Associacao.Dominio.Jogador;
import studying.JavaCore.Associacao.Dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Nesk");
        Time time = new Time("Team Liquid");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
