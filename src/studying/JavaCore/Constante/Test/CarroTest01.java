package studying.JavaCore.Constante.Test;

import studying.JavaCore.Constante.Model.Carro;
import studying.JavaCore.Constante.Model.Comprador;
import studying.JavaCore.Constante.Model.Porsche;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("BMW");
        Comprador comprador = new Comprador();
        carro.COMPRADOR.setNome("DRK");

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        Porsche porsche = new Porsche();
        porsche.setNome("911");
        carro.imprime();



    }
}
