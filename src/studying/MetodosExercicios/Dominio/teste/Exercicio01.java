package studying.MetodosExercicios.Dominio.teste;

import studying.MetodosExercicios.Dominio.Operacoes;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // input
        Scanner input = new Scanner(System.in);

        // lendo meu input do user
        System.out.print("Digite um número: ");
        int number = input.nextInt();

        // aplicando meu metodo
        Operacoes operacoes = new Operacoes();
        operacoes.exibirDobro(number);



    }
}
