package ExamPrep.Q1_First_Exam_Prep.Round3.Challenge1;

public class LKW extends Fahrzeug {
    private double kilometerstand;
    private double kostenProKilometer;
    private double maximaleZuladung;

    LKW(String bezeichnung, int baujahr, double kilometerstand, double kostenProKilometer, double maximaleZuladung ){
        super(bezeichnung,baujahr);
        this.kostenProKilometer = kostenProKilometer;
        this.kilometerstand = kilometerstand;
        this.maximaleZuladung = maximaleZuladung;
    }

    @Override
    protected double berechneKosten() {
        return kilometerstand * kostenProKilometer + maximaleZuladung*0.05;
    }

    protected String beschreibe(Fahrzeug f){
        return "LKW";
    }

}
