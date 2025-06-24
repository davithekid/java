package studying.Arrays;

import java.util.Scanner;

public class MaiorNumeroArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[4];
        int maior = Integer.MIN_VALUE; // -2147 e la cacetada
        int indiceMaior = -1;

        // fazendo a repetição do usuário
        for(int i = 0; i < numbers.length; i++ ){
            System.out.print("Digite um número: ");
            numbers[i] = input.nextInt();
        }

        // aqui estou pegando o maior numero e o indice
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > maior){ // verificando se meus numeros sao maiores que o min value
                maior = numbers[i]; // armazenando meu maior number nele
                indiceMaior = i; // armazenando meu indice
            }
        }
        System.out.println("Maior número é: " + maior + ", No indice: " + indiceMaior);
        input.close();

    }
}
