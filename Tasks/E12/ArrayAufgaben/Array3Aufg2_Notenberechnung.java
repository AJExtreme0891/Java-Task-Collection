package Tasks.E12.ArrayAufgaben;

import java.util.Scanner;

public class Array3Aufg2_Notenberechnung {
    static void noten(int[] notengrenzen, int gesamt, int erreicht){
        for (int i = 0; i < 15; i++) {
            System.out.println(i + " -> " + notengrenzen[i]);
        }
        System.out.println("15 -> " + notengrenzen[15]);



    }


    static void main(String[] args){
        int[] notengrenzen = new int[16];
        Scanner sc = new Scanner(System.in);
        notengrenzen[0] = 0;
        System.out.println("Whats the total score: ");
        int totalScore = sc.nextInt();
        double incre = (double) totalScore /15;
        double hold = 0;
        for (int i = 1; i < notengrenzen.length; i++) {
            notengrenzen[i] = (int) (hold + incre);
            hold = notengrenzen[i];
        }


        System.out.println("Whats your total score: ");
        int score = sc.nextInt();

        noten(notengrenzen, totalScore, score);

    }


}
