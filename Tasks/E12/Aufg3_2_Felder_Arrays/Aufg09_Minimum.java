package Tasks.E12.Aufg3_2_Felder_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Aufg09_Minimum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many random numbers:");
        int num = sc.nextInt();

        int[] ranNumField = new int[num];
        Random random = new Random();




        for (int i = 0; i < num; i++) {
            ranNumField[i] = random.nextInt(num);
        }

        int min = ranNumField[0];

        for (int i = 1; i < ranNumField.length; i++) {
            if (ranNumField[i] < min) {
                min = ranNumField[i];
            }
        }

        // print array
        System.out.println("Array:");
        for (int i = 0; i < num; i++) {
            System.out.print(ranNumField[i] + " ");
        }

        System.out.println("Smallest number is: " + min);
    }
}
