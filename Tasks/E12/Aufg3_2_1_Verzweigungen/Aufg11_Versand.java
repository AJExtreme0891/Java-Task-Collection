package Tasks.E12.Aufg3_2_1_Verzweigungen;

import java.util.Scanner;

public class Aufg11_Versand {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How much did you spend:");
        double payment = sc.nextDouble();

        if (payment <= 99){
            payment += 5;
        }
        else if (payment >= 100 && payment <= 199 ) {
            payment += 2;
        }

        System.out.println("Your payment is: " + payment + " €");

    }
}
