package Tasks.E12.Aufg3_2_1_Verzweigungen;

import java.util.Scanner;

public class Aufg10_Parkhaus {
    public static void main(String[] args){
        double basePrice = 2.5;
        int perHour = 1;
        int maxPrice = 10;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many extra minutes: ");
        int extraHours = sc.nextInt();

        extraHours = extraHours / 60;

        basePrice += perHour * extraHours;

        if(basePrice >10){
            basePrice = 10;
        }

        System.out.println("Your price is: " + basePrice + " €");


    }
}
