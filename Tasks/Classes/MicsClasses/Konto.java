package Tasks.Classes.MicsClasses;

public class Konto implements Comparable<Konto>{
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

    public double getKontostand() {
        return kontostand;
    }

    public String getInhaber() {
        return inhaber;
    }

    @Override
        public int compareTo(Konto konto) {
            return Double.compare(this.kontostand, konto.kontostand);
        }


}
