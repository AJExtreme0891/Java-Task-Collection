package Tasks.E12.IntermediateJavaWithLoops;
import java.util.Scanner;
public class CalcFaculty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int facaulty = 1;
            System.out.println("Fakultät von: ");
            int start = sc.nextInt();


            while (start < 0) {
                System.out.println("no negative numbers! Try again: ");
                start = sc.nextInt();


            }
            for (int i = start; i > 0; i--) {

                facaulty *= (i);

            }
            System.out.println("Your facaulty is: " + facaulty);

            System.out.println("Wanna stop:");
            String answer = sc.next();
            answer = answer.toLowerCase();
            if(answer.equals("yes")){
                break;
            }
        }

    }
}
