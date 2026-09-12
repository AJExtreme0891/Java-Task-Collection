package ExamPrep.E2ExamStudies;
import java.util.Scanner;

public class selfStudyParkscheinAutomat {
    public static void main(String[] args) {
//        Schreibe ein Programm:
//        Der Benutzer gibt ein:
//        Anzahl der Stunden (int)
//        Preise:
//        Bis 1 Stunde → 2 €
//        Bis 3 Stunden → 5 €
//        Mehr als 3 Stunden → 8 €
//        Ab 10 Stunden → Tagespreis 12 €
//        Zusatz:
//        Wenn der Preis über 10 € liegt, soll ein Hinweis erscheinen:
//„Tagespreis angewendet.“
Scanner sc = new Scanner(System.in);
int preis = 0, zeit;
String tagesPreis = "";

        System.out.println("Wie lange willst du Parken");
        zeit = sc.nextInt();
        String antwort = "Dein Betrag ist ";
        if (zeit <= 1){
            preis = 2;
        } else if (zeit <=3) {
            preis = 5;

        }else if(zeit < 10){
            preis = 8;
        }else if (zeit >= 10){
            preis = 12;
            tagesPreis = "(Tagespreis angewendet)";
        }

        System.out.println("Dein Betrag ist " + preis + "€ " + tagesPreis);


    }
}
