package studying.JavaCore.Classes.Exercicios.Model;

public class Pessoa {
    private String nome;
    private int idade;

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // getters
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

}
