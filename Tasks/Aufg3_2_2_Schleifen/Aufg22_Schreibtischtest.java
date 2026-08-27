package Tasks.Aufg3_2_2_Schleifen;

import java.util.Scanner;

public class Aufg22_Schreibtischtest {
    public static void main(String[] args){
        Scanner eingabe = new Scanner(System.in);

        int y, x = 1, total = 0;
        System.out.println("Bitte n eingeben: ");
        int n=eingabe.nextInt();

        for (int i = 1; i <= n ; i++) {
            y = x*x;
            System.out.println(y);
            total = total + y;
            x = x+1;
        }
        System.out.println("Total ist: " + total);
    }
}
