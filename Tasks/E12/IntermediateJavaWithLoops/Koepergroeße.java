package Tasks.E12.IntermediateJavaWithLoops;

import java.util.Scanner;

public class Koepergroeße {

    public static void main(String[] args) {
        double sumOfSize = 0, size = 0;
        int numOfPeople;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many");
        numOfPeople = sc.nextInt();
        
        for (int i = numOfPeople; i > 0; i--) {
            System.out.println("Was ist deine Größe: ");
            size = sc.nextDouble();
            if (!(size > 140 && size < 200)) {
                System.out.println("Versuch es diesmal mit einer richtigen Eingabe");
                i++;
            }else sumOfSize += size;
            System.out.print("still " + numOfPeople + " left");
        }




        double averageSize = sumOfSize / 12;
        System.out.println("Durchschnittsgröße ist: " + averageSize + "cm");


    }
}




