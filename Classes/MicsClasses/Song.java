package Classes.MicsClasses;

public class Song {
    private String title;
    private int laengeInSekunden;

    public Song(String title, int laengeInSekunden){
        this.laengeInSekunden = laengeInSekunden;
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public int getLaengeInSekunden(){
        return this.laengeInSekunden;
    }

}
