package studying.JavaCore.Classes.Exercicios.Model;

public class Produto2 {
    private String nome;
    private double preco;
    private int quantidade;

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double calcularValorTotal(){
        return this.preco * this.quantidade;
    }
}
