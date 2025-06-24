package studying.EstruturasCondicionais;

import java.util.Scanner;

public class EscolhaCalculo {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = myObj.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = myObj.nextInt();

        myObj.nextLine(); // aqui estou forçando uma quebra de linha pq por algum motivo ele LE o meu ENTER ANTERIROR
        System.out.println("Digite o operador (adição, subtração, divisão, multiplicação): ");
        String operador = myObj.nextLine();

        switch (operador) {
            case "adição":
                int soma = num1 + num2;
                System.out.print(soma);
                break;
            case "subtração":
                int subtracao = num1 - num2;
                System.out.print(subtracao);
                break;
            case "divisão" :
                int divisao = num1 / num2;
                System.out.print(divisao);
                break;
            case "multiplicacao":
                int multiplicacao = num1 * num2;
                System.out.print(multiplicacao);
                break;


        }

    }
}
