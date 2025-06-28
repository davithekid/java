package studying.JavaCore.Classes.Exercicios.Teste;

import studying.JavaCore.Classes.Exercicios.Model.Produto2;

public class ProdutoTest08 {

    public static void main(String[] args) {
        Produto2 produto = new Produto2();

        produto.setNome("Pó de maquiagem gotica");
        produto.setPreco(30);
        produto.setQuantidade(5);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor total: " + produto.calcularValorTotal());
    }
}
