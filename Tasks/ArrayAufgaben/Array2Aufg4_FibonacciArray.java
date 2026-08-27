package Tasks.ArrayAufgaben;

import java.util.Scanner;

public class Array2Aufg4_FibonacciArray {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long f1 = 1, f2 = 1;


        System.out.println("How long do you want the sequence to be: ");
        int iteration = sc.nextInt();
        long[] field = new long[iteration];




        field[0] = f1;
        field[1] = f2;


        for (int i = 2; i < iteration; i++) {
            long fn = f1 + f2;
            field[i] = fn;
            f1 = f2;
            f2 = fn;
        }
        int hold = 0;
        for (long i : field){
            System.out.print(i + ", ");
            hold++;
            if (hold == 5){
                System.out.println();
                hold = 0;
            }
        }
    }
}
