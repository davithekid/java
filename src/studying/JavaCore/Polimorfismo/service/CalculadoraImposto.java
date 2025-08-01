package studying.JavaCore.Polimorfismo.service;

import studying.JavaCore.Polimorfismo.Model.Produto;
import studying.JavaCore.Polimorfismo.Model.Tomate;


public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relátorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
