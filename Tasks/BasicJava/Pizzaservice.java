package Tasks.BasicJava;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Pizzaservice {
    public static void pizzaRechnung(String[] args) {
        NumberFormat n = NumberFormat.getNumberInstance(Locale.US);
        n.setMaximumFractionDigits(2);
        Scanner sc = new Scanner(System.in);
        double PreisPizza = 5.90;
        double Gesamtpreis;
        int preisAufschlag = 0;
        System.out.println("Willkommen zu unserem Pizza Service");
        System.out.println("Wollen sie ihre Pizza Liefern lassen Ja oder Nein: ");
        String liefernYJaOderNein = sc.nextLine();
        liefernYJaOderNein = liefernYJaOderNein.toLowerCase();
        boolean abholung = true;

        System.out.print("Wie viele Pizzas wollen sie haben: ");
        int anzahlAnPizza = sc.nextInt();

        Gesamtpreis = PreisPizza * anzahlAnPizza;
        if (anzahlAnPizza > 3) {
            Gesamtpreis = Gesamtpreis * 0.9;


            if (liefernYJaOderNein.equals("ja")) {
                System.out.println("Wie weit sind sie entfernt: ");
                int distanzVomLaden = sc.nextInt();


                preisAufschlag = 0;
                if (distanzVomLaden < 1 && distanzVomLaden <= 2) {
                    preisAufschlag += 1;
                }
                if (distanzVomLaden < 2 && distanzVomLaden <= 4) {
                    preisAufschlag += 2;
                }
                if (distanzVomLaden < 4) {
                    System.out.println("Lieferung nicht möglich. Bestellung wird als Abholung weiergeführt");
                    abholung = true;
                }


            }
            if (abholung){
                Gesamtpreis = Gesamtpreis + preisAufschlag;
                System.out.println("Der Preis für " + anzahlAnPizza + " Pizzen beträgt " + n.format(Gesamtpreis) + " Euro. Bitte holen sie ihre Bestellung bei uns ab.");
            }else
                System.out.println("Der Preis für " + anzahlAnPizza + " Pizzen beträgt " + n.format(Gesamtpreis) + " Euro.");



        }
    }
}
