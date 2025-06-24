package studying.EstruturasCondicionais;

import java.util.Scanner;

 class VerificarNumero {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if(number > 0){
            System.out.println("Seu numero é um positivo: " + number);
        } else {
            System.out.println("Seu número é um negativo: " + number);
        }

        scanner.close();

    }
}
