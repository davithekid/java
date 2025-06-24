package studying.LacosDeRepeticao;

import java.util.Scanner;

public class ContadorRegressivo {
    public static void main (String[] args){

        Scanner myObj = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int number = myObj.nextInt();

        if (number < 1) {
            System.out.print("Numéro inválido");
            myObj.close();
            return;
        }

        while(number > 0){
            number--;
            System.out.println(number);
        }

        myObj.close();

    }
}
