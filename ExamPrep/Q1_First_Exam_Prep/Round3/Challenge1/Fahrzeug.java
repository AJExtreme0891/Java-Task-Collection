package ExamPrep.Q1_First_Exam_Prep.Round3.Challenge1;

abstract class Fahrzeug {
    private String bezeichnung;
    private int baujahr;

    Fahrzeug(String bezeichnung, int baujahr){
        this.baujahr = baujahr;
        this.bezeichnung = bezeichnung;
    }

    protected String getBezeichnung() {
        return bezeichnung;
    }

    protected int getBaujahr() {
        return baujahr;
    }

    protected abstract double berechneKosten();
    protected String beschreibe(Fahrzeug f){
        return "Fahrzeug";
    }
    String info()~{
        return "Fahrzeug";
    }
}
