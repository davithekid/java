package studying.Arrays;

import java.util.Scanner;

public class ContandoNumerosPares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[9];
        int countPares = 0; // aqui vou armazenar quantos pares tem

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digitie um número: ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countPares++; // a cada numero par aqui incrementa
            }
        }
        System.out.println("Numeros pares: " + countPares);
        input.close();
    }
}
