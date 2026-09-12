package ExamPrep.Q1_First_Exam_Prep.Challenge3;

class Sensor {
    private String name;
    private double temperatur;

    protected Sensor(String pName, double pTemperatur) {
        this.name = pName;
        this.temperatur = pTemperatur;
    }

    protected String getName() {
        return this.name;
    }

    protected double getTemperatur() {
        return this.temperatur;
    }
}
