package ExamPrep.Q1_First_Exam_Prep.Round3.Challenge1;

import java.util.ArrayList;

public class Fuhrpark {
    private ArrayList<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();

    void addFahrzeug(Fahrzeug fahrzeug){
        this.fahrzeuge.add(fahrzeug);
    }
    double berechneGesamtkosten(){
        double result = 0;
        for(Fahrzeug fahrzeug : fahrzeuge){
            result += fahrzeug.berechneKosten();
        }
        return result;
    }
    Fahrzeug findeTeuerstesFahrzeug(){
        Fahrzeug teuerstes = fahrzeuge.getFirst();
        for(Fahrzeug fahrzeug : fahrzeuge){
            if (fahrzeug.berechneKosten()>teuerstes.berechneKosten()){
                teuerstes = fahrzeug;
            }
        }
        return teuerstes;
    }
}
