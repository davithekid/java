package studying.JavaCore.Classes.Exercicios.Teste;

import studying.JavaCore.Classes.Exercicios.Model.Produto;

public class ProdutoTest03 {

    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Hello kitty";
        produto.quantidade = 5;
        produto.preco = 35;

        System.out.println("O Total do produto é: " + produto.calcularTotal());
        produto.exibirDetalhes();

    }
}
