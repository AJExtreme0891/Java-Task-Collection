package ExamPrep.Q1_First_Exam_Prep.Challenge1;

class Fahrzeug {
    private String nummer;
    private int baujahr;

    protected Fahrzeug(String pNummer, int pBaujahr) {
        this.nummer = pNummer;
        this.baujahr = pBaujahr;
    }

    protected String getNummer() {
        return this.nummer;
    }

    protected int getBaujahr() {
        return this.baujahr;
    }

    protected double kosten() {
        return 0;
    }
}