package studying.Metodos.Dominio.Testes;

import studying.Metodos.Dominio.Estudante;
import studying.Metodos.Dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Deku";
        estudante.idade = 15;
        estudante.sexo = 'M';

        estudante2.nome = "Uraraka";
        estudante2.idade = 15;
        estudante2.sexo = 'F';


        impressora.imprime(estudante);
        System.out.println("-----------------");
        impressora.imprime(estudante2);





    }
}
