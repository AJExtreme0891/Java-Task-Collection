package Tasks.Aufg3_2_1_Verzweigungen;

import java.util.Scanner;

public class Aufg19_Praemien {
    public static void main(String[] args){
        double fixedPay = 500;
        Scanner sc = new Scanner(System.in);

        System.out.println("Was ist dein Monatsumsatz: ");
        double umsatz = sc.nextDouble();

        umsatz = (umsatz * 0.15);
        if (umsatz > 6000){
            umsatz += umsatz * 0.08;

        }
        if (umsatz >300){
            umsatz = 300;
        }
        fixedPay += umsatz;
        System.out.println("Your pay will be " + fixedPay + " €" +
                "");

    }
}
