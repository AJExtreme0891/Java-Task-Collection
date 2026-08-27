package Tasks.ArrayAufgaben;

import java.util.Scanner;
public class Array2Aufg3_abcBeliebige_Werte {
     static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How large: ");
        int size = sc.nextInt();
        
        int[] field = new int[size];
        
        System.out.println("Starting postion: ");
        int start = sc.nextInt();

        System.out.println("Please choose an increment: ");
        int incre = sc.nextInt();
        int hold = 0;
        field[0] = start;
         for (int i = 1; i < field.length; i++) {
             field[i] = field[i-1] + incre;


         }
         hold = 0;
         System.out.println("Array: ");
         for (int i : field) {
             System.out.print(i + ", ");
             hold++;
             if (hold == 5){
                 System.out.println();
                 hold = 0;
             }
         }
        
    }    
}