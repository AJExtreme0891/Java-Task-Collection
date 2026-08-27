package Tasks.Aufg3_2_Felder_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Aufg08_Summe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many random numbers:");
        int num = sc.nextInt();

        int[] ranNumField = new int[num];
        Random random = new Random();

        int sum = 0;

        // fill array and calculate sum
        for (int i = 0; i < num; i++) {
            ranNumField[i] = random.nextInt(0,num);
            sum += ranNumField[i];
        }

        // print array
        System.out.println("Array:");
        for (int i = 0; i < num; i++) {
            System.out.print(ranNumField[i] + " ");
        }

        System.out.println();
        System.out.println("Sum = " + sum);
    }

    }

