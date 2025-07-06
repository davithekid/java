package studying.JavaCore.Associacao.Test;

import studying.JavaCore.Associacao.Dominio.Escola;
import studying.JavaCore.Associacao.Dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor  = new Professor("Kakashi");
        Professor[] professors = {professor};
        Escola escola = new Escola("Doutor luiz lobo neto", professors);

        escola.imprime();




    }


}
