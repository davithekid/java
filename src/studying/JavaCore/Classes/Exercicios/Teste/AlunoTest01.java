package studying.JavaCore.Classes.Exercicios.Teste;

import studying.JavaCore.Classes.Exercicios.Model.Aluno;

public class AlunoTest01 {
    Aluno aluno = new Aluno();

    public void exibirInformacoes() {
        aluno.nome = "davi";
        aluno.idade = 20;
        aluno.nota = 8.4;
        System.out.println(aluno.nome);
        System.out.println(aluno.idade);
        System.out.println(aluno.nota);

    }

    public static void main(String[] args) {

        AlunoTest01 alunoTest = new AlunoTest01();
        alunoTest.exibirInformacoes();


    }
}
