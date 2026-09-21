package Tasks.E12.BasicJava;

import java.util.Scanner;
public class Parkscheinautomat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definition von Variablen
        int Stunden;
        double Geldbetrag, Parkgebuehr, Wechselgeld = 0;
        while (true) {
            // Eingabe
            System.out.print("Parkzeit in Stunden: ");
            Stunden = sc.nextInt();
            Parkgebuehr = Stunden * 0.5;

            // Verarbeitung
            if (Parkgebuehr > 5) {
                Parkgebuehr = 5;
            } // end of if
System.out.println("Du musst: "+Parkgebuehr +" € zahlen");

            
            System.out.print("Eingeworfener Geldbetrag in Euro: ");
            Geldbetrag = sc.nextDouble();
            
                do {
                    Parkgebuehr -= Geldbetrag;
                    System.out.println("Du musst noch: " + Parkgebuehr + " € zahlen");
                    Geldbetrag = sc.nextDouble();
                }while (Parkgebuehr > Geldbetrag);
                
            
            if (Parkgebuehr < Geldbetrag) {
                Wechselgeld = Geldbetrag - Parkgebuehr;
                System.out.println("Vielen Dank für deine Zahlung dein Wechselgeld beträgt: " + Wechselgeld);
            }
            if (Parkgebuehr == Geldbetrag) {
                System.out.println("\nVielen Dank für deine Zahlung\n");
            }

            System.out.println("\nStop");
            String stop = sc.next();
            if (stop.equals("yes")){
                break;
            }
        } // end of main
    }
}