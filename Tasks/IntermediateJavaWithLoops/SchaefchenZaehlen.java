package Tasks.IntermediateJavaWithLoops;

import java.util.Scanner;

public class SchaefchenZaehlen {
    public static void main(String[] args) throws InterruptedException {
//        int zaehler = 1;
//        while (zaehler <= 100) {
//            System.out.println("Schaefchen Nummer " + zaehler + " springt ueber den Zaun");
//            zaehler = zaehler + 1;
//            Thread.sleep(100);
//        }
//        zaehler = 100;
//        while (zaehler >= 0){
//            System.out.println("Schaefchen Nummer " + zaehler + " springt ueber den Zaun");
//            zaehler -= 2;
//            Thread.sleep(100);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Wie viele Schafe willst du: ");
        int numberOfSheep = sc.nextInt();

        System.out.println("Fängst du vom Start an?: ");
        String whereToStart = sc.next();

        if (numberOfSheep == 1){
            while (numberOfSheep <=100){
                System.out.println("Schaefchen Nummer " + numberOfSheep + " springt ueber den Zaun");
                numberOfSheep += 1;
                Thread.sleep(100);
            }
        }else {
            while (numberOfSheep <= 0){
                System.out.println("Schaefchen Nummer " + numberOfSheep + " springt ueber den Zaun");
                numberOfSheep -= 1;
                Thread.sleep(100);
            }
        }
        System.out.println("Alle Schafe sind über dem Zaun");

        // end of while
    } // end of main
} // end of class SchaefchenZaehler

