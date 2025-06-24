package studying.EstruturasCondicionais;

import java.util.Scanner;

public class CalcularMedia {
    public static void main (String[] args) {

        double grade1, grade2, grade3, media;

        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the student's first grade: ");
        grade1 = myObj.nextInt();

        System.out.println("enter the student´s second grade: ");
        grade2 = myObj.nextInt();

        System.out.println("enter the student´s third grade: ");
        grade3 = myObj.nextInt();

        media = (grade1 + grade2 + grade3) / 3;

        System.out.println(media);

        if(media >= 7 ){
            System.out.print("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }
        myObj.close();


    }
}
