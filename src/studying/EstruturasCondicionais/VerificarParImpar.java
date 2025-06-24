package studying.EstruturasCondicionais;
import java.util.Scanner;

public class VerificarParImpar {
    public static void main (String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("enter a number: ");
        int number = myObj.nextInt();

        if(number % 2 == 0){
            System.out.print("this is an even number "); // par
        } else {
            System.out.print("this is an odd number"); // impar
        }

        myObj.close();

    }


}
