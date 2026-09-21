package Tasks.E12.Aufg3_1_Methoden;

import java.util.Scanner;

public class Aufg02_SchnellesPotenzieren {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What base: ");
        double base = sc.nextDouble();

        System.out.println("What power: ");
        int power = sc.nextInt();

        System.out.println(toPower(base, power));
    }

    public static double toPower(double base, int power){
        double pot = 1;
        for (int i = 1; i <= power ; i++) {
            pot *= base;
        }
        return pot;
    }
}
