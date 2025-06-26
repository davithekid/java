package studying.JavaCore.Classes.Teste;

import studying.JavaCore.Classes.Model.Estudante;

public class EstudanteTest03 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Carol";
        estudante.idade = 17;
        estudante.sexo = 'F';

        estudante.imprime();
    }
}
