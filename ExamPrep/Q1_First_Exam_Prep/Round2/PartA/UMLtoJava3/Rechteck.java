package ExamPrep.Q1_First_Exam_Prep.Round2.PartA.UMLtoJava3;

public class Rechteck {
    private double width;
    private double height;

    protected Rechteck(double pB, double pH){
        this.height = pH;
        this.width = pB;

    }

    protected double Area(){
        return this.width * this.height;
    }

    protected double circumference(){
        return (this.height*2) + (this.width*2);
    }

    protected boolean istQuadrat(){
        return this.height == this.width;
    }
}
