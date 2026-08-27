package Classes.Fuhrparkverwaltungssystem;

abstract class FahrzeugeKlasse {
    private String kennzeichen;
    private int baujahr;
    private int inventarNummer;

    protected FahrzeugeKlasse(String kennzeichen, int baujahr, int inventarNummer) {
        this.kennzeichen = kennzeichen;
        this.baujahr = baujahr;
        this.inventarNummer = inventarNummer;
    }



    protected void honk(){
        System.out.println("...");
    }
}
