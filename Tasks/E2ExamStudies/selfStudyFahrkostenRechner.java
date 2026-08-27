package Tasks.E2ExamStudies;
import java.util.Scanner;

public class selfStudyFahrkostenRechner {
    public static void main(String[] args){
//        Fahrtkostenrechner
//        Kilometer (double)
//        Preis pro km (double)
//        Berechnung:
//        Gesamtkosten = km * preisProKm
//        Regeln:
//        Wenn Strecke über 100 km → 5% Rabatt
//        Wenn Strecke über 300 km → 10% Rabatt
//        Wichtig:
//        Runde auf 2 Nachkommastellen.
//                Ausgabe:
//        Ursprünglicher Preis
//        Rabatt in €
//                Endpreis
        Scanner sc = new Scanner(System.in);
        double distance, pricePerKm;
        String Rabatt = "";
        System.out.println("Wie weit bist du gefahren in km: ");
        distance = sc.nextDouble();
        System.out.println("\nWie viel zahlst du pro Kilometer in Euro: ");
        pricePerKm = sc.nextDouble();

        double result = distance * pricePerKm;
        if(distance > 100 && distance < 300){
            Rabatt = "(Rabatt von " + result*0.05 + "€ einberechnet";
            result *= 0.95;

        } else if (distance > 300) {
            Rabatt = "(Rabatt von " + result*0.10 + "€ einberechnet)";
            result *= 0.90;

        }
        System.out.println("Es wird " + Math.round(result*100)/100.0 + "€ kosten" + Rabatt);


    }
}
