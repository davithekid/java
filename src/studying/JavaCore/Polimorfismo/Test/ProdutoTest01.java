package studying.JavaCore.Polimorfismo.Test;

import studying.JavaCore.Polimorfismo.Model.Computador;
import studying.JavaCore.Polimorfismo.Model.Televisao;
import studying.JavaCore.Polimorfismo.Model.Tomate;
import studying.JavaCore.Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Pichau ", 1200);
        Tomate tomate = new Tomate("Cereja", 10);
        Televisao tv = new Televisao("Sansumg 60\"", 3500);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
