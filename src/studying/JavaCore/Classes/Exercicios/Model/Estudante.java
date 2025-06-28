package studying.JavaCore.Classes.Exercicios.Model;

public class Estudante {
    private String nome;
    private double[] notas = new double[3];

    // set nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // set notas
    public void setNotas(double[] nota) {
        this.notas = nota;
    }

    // get nome
    public String getNome() {
        return this.nome;
    }

    // get notas
    public double[] getNotas() {
        return this.notas;
    }

    public double calcularMedia() {
        // somando os valores do meu array
        double soma = 0;
        for (double num : this.notas) {
            soma += num;
        }

        return soma / notas.length; // aplicando a média
    }


}
