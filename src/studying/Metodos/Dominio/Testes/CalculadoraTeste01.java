package studying.Metodos.Dominio.Testes;

import studying.Metodos.Dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // como ele é uma função sem parametros, nao preciso passar nada pra ela ser executada
        calculadora.somarDoisNumeros();
    }
}
