package ExamPrep.Q1_First_Exam_Prep.Challenge1;

import java.util.ArrayList;

public class FuhrparkSystem {

    public static void main(String[] args) {
        ArrayList<Fahrzeug> fuhrpark = new ArrayList<Fahrzeug>();

        fuhrpark.add(new PKW("GG-AB12", 2020, 50000));
        fuhrpark.add(new LKW("GG-CD34", 2018, 120000, 8000));
        fuhrpark.add(new PKW("GG-EF56", 2023, 10000));
    }

    public static double gesamtkosten(ArrayList<Fahrzeug> Fuhrpark){
        double sum=0;
        for (Fahrzeug fahrzeug : Fuhrpark){
            sum += fahrzeug.kosten();
        }
        return sum;
    }

    public static Fahrzeug teuerstesFahrzeug(ArrayList<Fahrzeug> pFuhrpark) {
        Fahrzeug teuerstes = null;

        for (Fahrzeug f : pFuhrpark) {
            if (teuerstes == null || teuerstes.kosten() > f.kosten()) {
                teuerstes = f;
            }
        }

        return teuerstes;
    }
}
