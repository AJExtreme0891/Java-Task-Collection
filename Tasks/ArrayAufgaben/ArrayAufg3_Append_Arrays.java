package Tasks.ArrayAufgaben;

import java.util.Random;
import java.util.Scanner;

public class ArrayAufg3_Append_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many random numbers:");
        int num1 = sc.nextInt();

        System.out.println("How many random numbers:");
        int num2 = sc.nextInt();

        int[] ranNumField1 = new int[num1];
        int[] ranNumField2 = new int[num2];

        // fill array and calculate sum
        for (int i = 0; i < num1; i++) {
            ranNumField1[i] = random.nextInt(-10, 11);
        }
        for (int i = 0; i < num2; i++) {
            ranNumField2[i] = random.nextInt(-10, 11);
        }
        System.out.println("Array1 Full:");
        for (int i = 0; i < num1; i++) {
            System.out.print(ranNumField1[i] + ", ");

        }
        System.out.println("\nArray2 Full:");
        for (int i = 0; i < num2; i++) {
            System.out.print(ranNumField2[i] + ", ");

        }
        int[] appendedField = new int[num1+num2];

        for (int i = 0; i < num1; i++) {
            appendedField[i] = ranNumField1[i];
        }
        for (int i = 0 ; i < num2 ; i++) {
            appendedField[num1+i] = ranNumField2[i];
        }


        // print array
        System.out.println("\nArray Appended:");
        for (int j : appendedField) {
            System.out.print(j + ", ");
        }

    }
}
