package Tasks.E12.BasicJava;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Pizzaservice_vone {

    //Verarbeitung
    public static String calcCost(int anzahlPizzen, boolean isDelivery, int distance) {
        double preisPizza = 5.90;
        double gesamtPreis = preisPizza * anzahlPizzen;

        // Rabatt ab 3 Pizzen
        if (anzahlPizzen >= 3) {
            gesamtPreis *= 0.9; // 10% Rabatt
        }

        if (isDelivery) {
            if (distance <= 0) {
                System.out.println("Distanz zu gering. Bestellung wird als Abholung eingestellt.");
            } else if (distance > 4) {
                System.out.println("Lieferung nicht möglich. Bestellung wird als Abholung weitergeführt.");
            } else if (distance > 2) {
                gesamtPreis += 2;
            } else {
                gesamtPreis += 1;
            }
        }

        NumberFormat n = NumberFormat.getNumberInstance(Locale.US);
        n.setMaximumFractionDigits(2);
        return n.format(gesamtPreis);
    }

    public static void main(String[] args) {
        //Eingabe
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Anzahl bestellter Pizzen: ");
            int anzahlPizzen = sc.nextInt();

            System.out.print("Wollen Sie es liefern lassen? (ja/nein): ");
            String deliveryInput = sc.next().toLowerCase();
            boolean isDelivery = deliveryInput.equals("ja") || deliveryInput.equals("yes");

            int distance = 0;
            if (isDelivery) {
                System.out.print("Ok. Wie weit wohnen Sie in km? ");
                distance = sc.nextInt();
            }else if (!isDelivery){
                System.out.println("Ihre Bestellung wird als Abholung weitergeführt");
            }
            //Ausgabe
            System.out.println("Der Preis für " + anzahlPizzen + " Pizzen beträgt " + calcCost(anzahlPizzen, isDelivery, distance) + " Euro");
            System.out.println(System.lineSeparator() + "Willst du eine weitere Bestellung haben");
            String carryOn = sc.next().toLowerCase();
            boolean isCarryOn = carryOn.equals("ja") || carryOn.equals("yes");
            if (!isCarryOn){
                break;
            }
        }
    }
}