package ExamPrep.Q1_First_Exam_Prep.Challenge1;

class PKW extends Fahrzeug {
    private double kilometerstand;

    protected PKW(String pNummer, int pBaujahr, double pKilometerstand) {
        super(pNummer, pBaujahr);
        this.kilometerstand = pKilometerstand;
    }

    @Override
    protected double kosten() {
        return this.kilometerstand * 0.15;
    }
}
