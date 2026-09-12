package ExamPrep.Q1_First_Exam_Prep.Round3.Challenge1;

public class PKW extends Fahrzeug{
    private double kilometerstand;
    private double kostenProKilometer;


    PKW(String pBezeichnung, int pBaujahr, double pKilometerstand, double pKostenProKilometer){
        super(pBezeichnung, pBaujahr);
        this.kilometerstand = pKilometerstand;
        this.kostenProKilometer = pKostenProKilometer;
    }

    @Override
    protected double berechneKosten() {
        return kilometerstand * kostenProKilometer;
    }

    protected String beschreibe(PKW p){
        return "PWK";
    }

    String info(){
        return "PWK";
    }

}
