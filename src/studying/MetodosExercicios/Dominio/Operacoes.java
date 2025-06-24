package studying.MetodosExercicios.Dominio;

import java.util.Scanner;


public class Operacoes {
    Scanner input = new Scanner(System.in);

    // função sem retorno e com parametro
    public void exibirDobro(int number) {
        System.out.print("O Dobro de  " + number + " é " + (number * 2));
    }

    // função com retorno e sem parametro
    public int numeroAleatorio() {
        int randomNum = (int) (Math.random() * 101);
        return randomNum;
    }

    // função com retorno e parametro
    public double calcularMedia(int num1, int num2, int num3) {
        double media = num1 + num2 + num3;
        return media / 3;
    }

    public String criarMensagem(String nome, int idade) {
        return "Aluno/a " + nome + ", idade " + idade + " anos";
    }

    public class CalculadoratesteCompleto{

        public int somar(int a, int b) {
            return a + b;
        }

        public int subtrair(int a, int b) {
            return a - b;
        }

        public double multiplicar(int a, int b) {
            return a * b;
        }

        public double dividir (double a, double b){
            return a / b;
        }

    }
}
