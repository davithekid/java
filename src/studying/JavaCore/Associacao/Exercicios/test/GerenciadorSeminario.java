package studying.JavaCore.Associacao.Exercicios.test;

import studying.JavaCore.Associacao.Exercicios.Model.Aluno;
import studying.JavaCore.Associacao.Exercicios.Model.Local;
import studying.JavaCore.Associacao.Exercicios.Model.Professor;
import studying.JavaCore.Associacao.Exercicios.Model.Seminario;

public class GerenciadorSeminario {
    public static void main(String[] args) {
        Local local = new Local("Rua Boa Vista 820");
        Aluno aluno = new Aluno("Davi", 20);
        Professor professor = new Professor("Carol", "Ingles");
        Aluno[] alunosParaSeminario = {aluno};


        Seminario seminario = new Seminario("Inglês", local, alunosParaSeminario);
        Seminario[] seminariosDisponeis = {seminario};
        professor.setSeminarios(seminariosDisponeis);
        professor.imprime();

    }
}
