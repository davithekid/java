package studying.JavaCore.Construturores.Exercicios.Model;

public class Aluno {
    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        this.idade = idade;
        this.nome = nome;
        this.nota = nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getNota(){
        return this.nota;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Nota: " + this.nota);
    }


}
