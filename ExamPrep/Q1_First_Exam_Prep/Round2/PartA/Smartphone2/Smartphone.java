package ExamPrep.Q1_First_Exam_Prep.Round2.PartA.Smartphone2;

public class Smartphone {
    private String marke;
    private String model;
    private int battery;
    private int storageInGB;

    protected Smartphone(String marke, String model, int battery, int storageInGB){
        this.marke = marke;
        this.model = model;
        this.battery = 100;
        this.storageInGB = storageInGB;
    }

    protected void laden(int percent){
        if (percent >= 0){
            this.battery += percent;
        }
        if (this.battery >100){
            this.battery = 100;
        }
    }

    protected void benutzen(int minutes){
        if(minutes >0){

        this.battery -= minutes/10;

        if(this.battery < 0){
            this.battery = 0;
        }
        }
    }
    protected boolean istLeer(){
        return this.battery == 0;
    }
}
