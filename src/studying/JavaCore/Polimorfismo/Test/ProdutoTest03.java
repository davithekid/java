package studying.JavaCore.Polimorfismo.Test;

import studying.JavaCore.Polimorfismo.Model.Computador;
import studying.JavaCore.Polimorfismo.Model.Produto;
import studying.JavaCore.Polimorfismo.Model.Tomate;
import studying.JavaCore.Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("GTX 150", 1200);

        Tomate tomate = new Tomate("Italiano", 12);
        tomate.setDataValidade("20/03/21");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
