package studying.JavaCore.Static.test;

import studying.JavaCore.Static.Model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Bmw",  280);
        Carro carro2 = new Carro("Mercedes" , 275);
        Carro carro3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(150);
        carro.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
