package Tasks.Aufg3_2_1_Verzweigungen;

import java.util.Scanner;

public class Aufg13_PQFormel {
    public static double[] solvePQ(double p, double q) {
        double x1 = -(p / 2) + (Math.sqrt(Math.pow((p / 2), 2) - q));
        double x2 = -(p / 2) - (Math.sqrt(Math.pow((p / 2), 2) - q));
        return new double[]{x1, x2};
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your value for p: ");
        double p = sc.nextDouble();

        System.out.println("Please enter your value for q: ");
        double q = sc.nextDouble();

        double[] values = solvePQ(p,q);

        System.out.println("x1 = " + values[0] + " : " + "x2 = " + values[1]);
    }

}
