package Classes.MicsClasses;

public class Konto {
    private String inhaber;
    private double kontostand;


    public Konto(String inhaber, double kontostand){
        this.inhaber = inhaber;
        this.kontostand = kontostand;
    }
    public Konto(String inhaber){
        this.inhaber = inhaber;
        this.kontostand = 0;
    }

    public void einzahlung(double payment){
        if (payment > 0){
            this.kontostand += payment;
        }
    }
}
