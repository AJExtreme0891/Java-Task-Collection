package Tasks.E12.IntermediateJavaWithLoops;
import java.util.Scanner;
public class CaclSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int Zahl;
            int Ergebnis = 0;
            System.out.print("Geben Sie eine positive Ganzzahl ein: ");
            Zahl = sc.nextInt();

            if (Zahl>0) {

                for (int i =1;Zahl >= i; i++) {
                    Ergebnis += i; // Entspricht: Ergebnis = Ergebnis + i;
                } // end of while
                System.out.println("Das Ergebnis lautet: " + Ergebnis);
            } // end of if
            else {
                System.out.println("Bitte geben Sie eine positive Ganzzahl ein!");
            } // end of if-else
        } // end of main
    } // end of class Summe

