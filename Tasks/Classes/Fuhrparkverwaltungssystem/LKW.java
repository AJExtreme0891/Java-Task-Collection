package Tasks.Classes.Fuhrparkverwaltungssystem;

class LKW extends FahrzeugeKlasse {
    private double kilometerStand;


    protected LKW(String kennzeichen, int baujahr, int inventarNummer) {

        super(kennzeichen, baujahr, inventarNummer);
        this.kilometerStand = 0;
    }

    protected LKW(String kennzeichen, int baujahr, int inventarNummer, double kilometerStand) {

        super(kennzeichen, baujahr, inventarNummer);
        this.kilometerStand = kilometerStand;
    }
}

