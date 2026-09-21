package Tasks.Classes.MicsClasses;

public class Schueler {


    private String name, klasse;
    private int alter;


    public Schueler(String name, String klasse, int alter) {
        this.name = name;
        this.alter = alter;
        this.klasse = klasse;
    }

    public String getName() {
        return name;
    }

    public String getKlasse() {
        return this.klasse;
    }

    public int getAlter() {
        return this.alter;
    }

    public void setAlter(int alter){
        if(alter >= 5 && alter <= 120){
            this.alter = alter;
        }
    }
}
