package Tasks.E12.ArrayAufgaben;

import java.util.Scanner;
import java.util.Random;
public class Array2Aufg6_Double_Array {
    static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[] field = new int[10];
        System.out.println("Multiplier: ");
        int mult = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            field[i] = random.nextInt(0,21);

        }
        System.out.println("Array before multiplier: ");
        for(int j : field){
            System.out.print(j + ", ");
        }
        for (int i = 0; i < field.length; i++){
            field[i] = field[i] * mult;
        }


        System.out.println();
        System.out.println("\nArray after multiplier: ");
        for (int j : field){
            System.out.print(j+ ", ");
        }
    }

}
