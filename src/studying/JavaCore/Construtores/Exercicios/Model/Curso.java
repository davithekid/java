package studying.JavaCore.Construtores.Exercicios.Model;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private Aluno[] alunos;

    public Curso(String nome, int cargaHoraria, Aluno[] alunos) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.alunos = alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void mostrarCurso() {
        System.out.println("Curso: " + this.nome);
        System.out.println("Carga horária: " + this.cargaHoraria);
        System.out.println("Alunos matriculados: ");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + ", Idade: " + aluno.getIdade());
        }
    }

    public void quantidadeAlunos() {
        System.out.println("Quantidade de alunos: " + alunos.length);
    }
}
