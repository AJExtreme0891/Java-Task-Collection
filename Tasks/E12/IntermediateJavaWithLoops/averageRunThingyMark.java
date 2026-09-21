package Tasks.E12.IntermediateJavaWithLoops;
import java.util.Scanner;


public class averageRunThingyMark {
    public static void main(String[] args) {
        int numOfTimes;
        double time, timeSum = 0, averageTime;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Wie viele Zeiten willst du eingeben: ");
            numOfTimes = sc.nextInt();

            if (numOfTimes <= 0) {
                System.out.println("Having run" + numOfTimes + " times isnt useful. Write a number thats more than 0");
                continue;
            }
            for (int i = numOfTimes; i > 0; i--) {
                System.out.println("how long did it take in hours: ");
                time = sc.nextDouble();
                timeSum += time;
            }
            averageTime = timeSum / numOfTimes;
            System.out.println("\nYour average is: " + Math.round(averageTime*100)/100.0);

            System.out.println("\nStop?");
            String isStopping = sc.next();
            isStopping = isStopping.toLowerCase();
            if (isStopping.equals("yes")){
                break;
            }
        }
    }
}