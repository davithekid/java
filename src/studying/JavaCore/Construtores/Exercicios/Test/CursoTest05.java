package studying.JavaCore.Construtores.Exercicios.Test;
import studying.JavaCore.Construtores.Exercicios.Model.Aluno;
import studying.JavaCore.Construtores.Exercicios.Model.Curso;

public class CursoTest05 {
    public static void main(String[] args) {
        Curso curso = new Curso("Dev", 1200, new Aluno[]{
                new Aluno("Carol", 20),
                new Aluno("Davi", 22)
        });


        curso.mostrarCurso();
        curso.quantidadeAlunos();


    }
}
