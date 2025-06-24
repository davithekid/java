package studying.LacosDeRepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Digite um número para calcular a tabuada: ");
        int number = myObj.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tabuada = number * i;
            System.out.println(number + " x " + i + " = " + tabuada);
        }

        myObj.close();
    }
}
