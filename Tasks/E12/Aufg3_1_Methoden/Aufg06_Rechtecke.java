package Tasks.E12.Aufg3_1_Methoden;

import java.util.Scanner;

public class Aufg06_Rechtecke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Height:");
            int height = sc.nextInt();

            System.out.println("Width:");
            int width = sc.nextInt();

            System.out.println("Lean (spaces added each row):");
            int lean = sc.nextInt();

            drawRectangle(height, width, lean);


            System.out.println(" ");

            System.out.println("stop?");
            String stop = sc.next();
            stop = stop.toLowerCase();
            if (stop.equals("yes")){
                break;
            }
            System.out.println(" ");
            System.out.println(" ");

        }
    }

    public static void drawRectangle(int height, int width, int lean){

        for (int i = 0; i < height; i++) {

            // spaces before stars
            for (int j = 0; j < i * lean; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
