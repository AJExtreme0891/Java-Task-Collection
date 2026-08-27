package Tasks.Aufg3_2_Felder_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Aufg13_Würfel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Wie viele Würfe: ");
        int tries = sc.nextInt();

        int[] dice = new int[tries];

        for (int i = 0; i < tries; i++) {
            dice[i] = ran.nextInt(1, 7);
        }

        for (int i = 1; i <= 6; i++) {
            int count = 0; 

            for (int j = 0; j < tries; j++) {
                if (dice[j] == i){
                    count++;
                }
            }

            double relative = (double) count / tries;

            System.out.print("Zahl " + i + ":");
            System.out.print(count + "(" + Math.round(relative*100)/100.0 + "%)\n");
            
        }
    }
}