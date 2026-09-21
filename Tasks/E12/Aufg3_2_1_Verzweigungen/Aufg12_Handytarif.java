package Tasks.E12.Aufg3_2_1_Verzweigungen;

import java.util.Scanner;

public class Aufg12_Handytarif {
    public static void main(String[] args){
        double basePrice = 5, extraMinutes = 0.19, extraMessages = 0.09;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many minutes: ");
        int mins = sc.nextInt();

        System.out.println("How many messages");
        int messages = sc.nextInt();

        if(messages > 50 ){
            messages = messages - 50;
            basePrice += extraMinutes * messages;
        }
        if (mins > 50){
            mins = mins - 50;
            basePrice += extraMinutes * mins;
        }

        System.out.println("Your price will be: " + basePrice);
    }
}
