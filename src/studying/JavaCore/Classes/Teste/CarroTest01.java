package studying.JavaCore.Classes.Teste;

import studying.JavaCore.Classes.Model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Porsche 911";
        carro.modelo = "Esportivo";
        carro.ano = 2010;

        carro2.nome = "Lancer";
        carro2.modelo = "Esportivo";
        carro2.ano = 2007;

        System.out.println("Nome:" + carro.nome + ", Modelo:" + carro.modelo + ", Ano:" + carro.ano );
        System.out.println("Nome:" + carro2.nome + ", Modelo:" + carro2.modelo + ", Ano:" + carro2.ano );

    }
}
