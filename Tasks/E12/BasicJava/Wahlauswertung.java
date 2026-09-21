package Tasks.E12.BasicJava;
import java.util.Scanner;
public class Wahlauswertung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definition von Variablen
        int StimmenMathe, StimmenEnglisch, StimmenDeutsch;
        double Summe, AnteilMathe, AnteilEnglisch, AnteilDeutsch;
// Eingabe
        System.out.print("Stimmen Mathe: ");
        StimmenMathe = sc.nextInt();
        System.out.print("Stimmen Englisch: ");
        StimmenEnglisch = sc.nextInt();
        System.out.print("Stimmen Deutsch: ");
        StimmenDeutsch = sc.nextInt();
// Verarbeitung
        Summe = StimmenMathe + StimmenEnglisch + StimmenDeutsch;
        AnteilMathe = (double)StimmenMathe / Summe * 100;
        AnteilEnglisch = (double)StimmenEnglisch / Summe * 100;
        AnteilDeutsch = 100 - (double)AnteilMathe - AnteilEnglisch;
// Ausgabe
        System.out.println("Anteil Mathe: " + Math.round(AnteilMathe*100)/100.0 + " %");
        System.out.println("Anteil Englisch: " + Math.round(AnteilEnglisch*100)/100.0 + " %");
        System.out.println("Anteil Deutsch: " + Math.round(AnteilDeutsch*100)/100.0 + " %");
    }// end of main
}// end of class Tasks.E12.BasicJava.Wahlauswertung