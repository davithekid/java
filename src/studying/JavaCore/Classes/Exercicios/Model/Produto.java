package studying.JavaCore.Classes.Exercicios.Model;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double calcularTotal() {
        return preco * quantidade;
    }

    public void exibirDetalhes() {
        System.out.println("Nome do produto: " + nome + ", Preço unitário: " + preco + ", Quantidade: " + quantidade);
    }


}
