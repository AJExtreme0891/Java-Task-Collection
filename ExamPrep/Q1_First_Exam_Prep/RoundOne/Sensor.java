package ExamPrep.Q1_First_Exam_Prep.RoundOne;

class Sensor {
    private String name;
    private double temperatur;

    protected Sensor(String pName, double pTemperatur) {
        name = pName;
        temperatur = pTemperatur;
    }

    protected double getTemperatur() {
        return temperatur;
    }

    protected String getName() {
        return name;
    }
}



