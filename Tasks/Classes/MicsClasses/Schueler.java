package Tasks.Classes.MicsClasses;

public class Schueler{


    private String name, klasse;
    private int alter;
    private int grade;


    public Schueler(String name, String klasse, int alter) {
        this.name = name;
        this.alter = alter;
        this.klasse = klasse;
    }
    public Schueler(String name, int alter, int grade){
        this.name = name;
        this.alter = alter;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getKlasse() {
        return this.klasse;
    }

    public int getGrade(){
        return this.grade;
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
