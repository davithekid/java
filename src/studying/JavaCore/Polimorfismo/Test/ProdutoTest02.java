package studying.JavaCore.Polimorfismo.Test;

import studying.JavaCore.Polimorfismo.Model.Computador;
import studying.JavaCore.Polimorfismo.Model.Produto;
import studying.JavaCore.Polimorfismo.Model.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 1500);
        Produto produto2 = new Tomate("Italiano", 7.58);

        // pc
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("-------------");

        // tomate
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        // nao consigo chamar metodo dataDeValidade
    }
}
