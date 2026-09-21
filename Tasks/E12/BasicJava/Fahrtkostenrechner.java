package Tasks.E12.BasicJava;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Fahrtkostenrechner {
    public static void main(String[] args) {
        NumberFormat n = NumberFormat.getNumberInstance(Locale.US);
        n.setMaximumFractionDigits(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie weit sind sie gefahren in km: ");
        double distance_in_km = sc.nextDouble();
        System.out.println("Wie viel verbrauchen sie pro km: ");
        double gas_per_km = sc.nextDouble();
        double result = distance_in_km * (gas_per_km/100) * 1.34;

        System.out.println("Du musst " + n.format(result) + " € für dein Gas zahlen" );


    }
}
