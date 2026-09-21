package Tasks.E12.BasicJava;

import java.util.Scanner;

public class Handykosten {
    public static void Handykostenberechnen(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definition von Variablen
        String Name;
        int AnzahlSMS;
        double PreisSMS;
        double KostenSMS;
// Eingabe
        System.out.println("--- Eingabe ---");
        System.out.println("Dein Name: ");
        Name = sc.next();
        System.out.println("Anzahl der SMS: ");
        AnzahlSMS = sc.nextInt();
        System.out.println("Preis pro SMS");
        PreisSMS = sc.nextDouble();
// Verarbeitung
        KostenSMS = AnzahlSMS * PreisSMS;
// Ausgabe
        System.out.println("");
        System.out.println("--- Ausgabe ---");
        System.out.println("Tasks.E12.BasicJava.Handykosten für " + Name);
        System.out.println("Kosten für " +
                AnzahlSMS +" SMS: " +
                KostenSMS +
                "Euro");
    }// end of main
} // end of class Tasks.E12.BasicJava.Handykosten