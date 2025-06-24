package studying.JavaCore.Classes.Teste;

import studying.JavaCore.Classes.Model.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // coloco minha variavel de referencia // criando o objeto Estudante
        Estudante estudante = new Estudante();
        estudante.nome = "Carol";
        estudante.idade = 17;
        estudante.sexo = 'F';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
