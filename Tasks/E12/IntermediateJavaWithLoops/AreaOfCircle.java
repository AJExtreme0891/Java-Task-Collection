package Tasks.E12.IntermediateJavaWithLoops;

import java.util.Scanner;
public class AreaOfCircle {
    public static double calcAreaOfCircle (double radius){
        return Math.PI * (radius * radius);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Was ist der Radius deines Kreises: ");
            String radius = sc.next();
            double digitsRadius = Double.parseDouble(radius.replaceAll("[^0-9. ]", ""));
            String lettersRadius = radius.replaceAll("[0-9. ]", "");

            System.out.println("The Area of your circle with a radius of " + radius + " is " + Math.round(calcAreaOfCircle(digitsRadius) * 100) / 100.0 + lettersRadius);
            System.out.println("\n Do you stop: ");
            String answer = sc.next();
            answer = answer.toLowerCase();
            if (answer.equals("yes")){
                  break;
            }
        }
    }


}
