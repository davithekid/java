package studying.Arrays;

import java.util.Scanner;

public class MediaArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // adicionando um tamanho pro array
        int[] valores = new int[4];

        // repetindo 4x o input
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite um número: ");
            valores[i] = input.nextInt();
        }

        // fazendo a soma dos valores
        int soma = 0;
        for (int n : valores) {
            soma += n;
        }
        // aqui eu estou pegando a media da soma e divindo pela quantidade de elementos
        int media = soma / valores.length;

        System.out.print("A Sua média é: " + media);
        input.close();

    }
}
