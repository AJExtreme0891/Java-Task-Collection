package Tasks.E12.Aufg3_2_2_Schleifen;

import java.util.Scanner;

public class Aufg26_Primzahltest {
    public static boolean isPrime(int i){
        if (i < 2) return false;

        for (int j = 2; j * j <= i; j++) {
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =0;
        System.out.println(isPrime(n));
    }
}
