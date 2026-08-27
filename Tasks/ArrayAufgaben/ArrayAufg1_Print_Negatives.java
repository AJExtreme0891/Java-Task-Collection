package Tasks.ArrayAufgaben;

import java.util.Random;
import java.util.Scanner;

public class ArrayAufg1_Print_Negatives {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many random numbers:");
        int num = sc.nextInt();

        int[] ranNumField = new int[num];
        Random random = new Random();


        // fill array and calculate sum
        for (int i = 0; i < num; i++) {
            ranNumField[i] = random.nextInt(-10, 11);
        }

        System.out.println("Array Full:");
        for (int i = 0; i < num; i++) {
                System.out.print(ranNumField[i] + " ");

        }


        // print array
        System.out.println("\nArray Negative:");
        for (int i = 0; i < num; i++) {
            if (ranNumField[i] < 0) {
                System.out.print(ranNumField[i] + " ");
            }
        }
    }
}