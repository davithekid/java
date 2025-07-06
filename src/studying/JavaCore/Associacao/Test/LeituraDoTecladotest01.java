package studying.JavaCore.Associacao.Test;

import java.util.Scanner;

public class LeituraDoTecladotest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String next = input.nextLine();
        System.out.println("Olá, " + next + "!!");

    }
}
