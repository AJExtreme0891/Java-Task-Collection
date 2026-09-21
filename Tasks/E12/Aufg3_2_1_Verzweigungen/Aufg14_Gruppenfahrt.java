package Tasks.E12.Aufg3_2_1_Verzweigungen;

import java.util.Scanner;

public class Aufg14_Gruppenfahrt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int freetickets = 0;
        System.out.println("Whats your regular price: ");
        double basePrice = sc.nextDouble();

        System.out.println("How many people are traveling: ");
        int travelers = sc.nextInt();

        if(travelers >= 10){
            basePrice /= 2;

        }
        if(travelers >= 16){
            freetickets = travelers / 16;
        }

        System.out.println("Price per ticket: " + Math.round(basePrice/(travelers-1)*100)/100.0);
        if(freetickets != 0){
            System.out.println("Amount of freetickets: " + freetickets);
        }else System.out.println("No freetickets");
        System.out.println("Price per traveler: " + Math.round(basePrice/travelers*100)/100.0);
    }
}
