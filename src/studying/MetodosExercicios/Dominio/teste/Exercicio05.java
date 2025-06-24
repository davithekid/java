package studying.MetodosExercicios.Dominio.teste;

import studying.MetodosExercicios.Dominio.Operacoes;

public class Exercicio05 {
    public static void main(String[] args) {
        // instanciando minha classe major
        Operacoes operacoes = new Operacoes();

        // para minhan inne class preciso fazer isso aqui
        Operacoes.CalculadoratesteCompleto calculadora = operacoes.new CalculadoratesteCompleto();

        System.out.println(calculadora.somar(10, 20));
        System.out.println(calculadora.subtrair(10, 20));
        System.out.println(calculadora.dividir(10, 20));
        System.out.println(calculadora.multiplicar(10, 20));

    }
}
