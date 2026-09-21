package Tasks.E12.BasicJava;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Maklerfirma {
    public static double areaCalc(double width, double length){
        return width * length;
    }


    public static void Grundstueckpreisberechnen(String[] args){
        NumberFormat n = NumberFormat.getNumberInstance(Locale.US);
        n.setMaximumFractionDigits(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie breit ist dein Haus in m: ");
        double width = sc.nextDouble();
        System.out.println("Wie lang ist dein Haus in m: ");
        double length = sc.nextDouble();
        System.out.println("Und wie viel ist der Preis deines Grundstücks pro meter: ");
        double price = sc.nextDouble();
        System.out.println("Was ist deine Mehrwertsteuer in Prozent: ");
        double tax = sc.nextDouble();
        double area = areaCalc(width, length);
        double resultingPrice = (area * price) + ( area / 0.03) + (area / (tax/100.0));
        System.out.println("Dein Gesamtbetrag wird: " + n.format(resultingPrice) + " € sein.");

    }




}
