package Tasks.E12.Aufg3_1_Methoden;

import java.util.Scanner;

public class Aufg03_EgyptianMultiplication {


    public static double egyptMulti(double x, double y) {
        double prod = 0;

        while (y > 0) {
            if (y % 2 == 0) {
                x = x * 2;
                y = y / 2;
            } else {
                prod = prod + x;
                y = y - 1;
            }//end of if
        }//end of while

        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First Number: ");
        double x = sc.nextInt();

        System.out.println("Second Number: ");
        double y = sc.nextInt();

        double prod = egyptMulti(x, y);

        System.out.println(prod);
    }

}

