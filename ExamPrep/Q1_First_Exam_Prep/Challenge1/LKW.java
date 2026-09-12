package ExamPrep.Q1_First_Exam_Prep.Challenge1;

 class LKW extends Fahrzeug {
    private double kilometerstand;
    private double zuladung;

    protected LKW(String pNummer, int pBaujahr,
               double pKilometerstand, double pZuladung) {
        super(pNummer, pBaujahr);
        this.kilometerstand = pKilometerstand;
        this.zuladung = pZuladung;
    }

    @Override
    protected double kosten() {
        return this.kilometerstand * 0.30 + this.zuladung * 2;
    }
}
