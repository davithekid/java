package studying.Arrays;

import java.util.Scanner;

public class SomarTodoArray {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        // aqui estou indicando o tamanho do meu array
        int[] numbers = new int[4];

        // estou repetindo para o usuário escrever 4 vezes e pegano o input dele
        // e atribuindo pro meu array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = myObj.nextInt();
        }

        // estou criando minha variavel de soma
        int soma = 0;
        // nesse for each estou fazendo com que n percorra os numbers e acabe somando tudo
        for (int n : numbers) {
            soma += n;
        }
        System.out.println("A Soma é: " + soma);

        myObj.close();

    }
}
