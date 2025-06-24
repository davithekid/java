package studying.Metodos.Dominio.Testes;

import studying.Metodos.Dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

       double result = calculadora.dividirDoisNumeros(10, 20);
       System.out.print(result);
    }
}
