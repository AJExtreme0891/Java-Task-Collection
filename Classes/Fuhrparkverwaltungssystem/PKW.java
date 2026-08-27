package Classes.Fuhrparkverwaltungssystem;

class PKW extends FahrzeugeKlasse {
    private double kilometerStand;
    private double maximaleZuladung;

    protected PKW(String kennzeichen, int baujahr, int inventarNummer, double maximaleZuladung ){

        super(kennzeichen, baujahr, inventarNummer);
        this.maximaleZuladung = maximaleZuladung;
        this.kilometerStand = 0;
    }
    protected PKW(String kennzeichen, int baujahr, int inventarNummer, double maximaleZuladung, int kilometerStand){

        super(kennzeichen, baujahr, inventarNummer);
        this.maximaleZuladung = maximaleZuladung;
        this.kilometerStand = kilometerStand;
    }

    @Override
    protected void honk(){
        System.out.println("Car Honk");
    }
}
