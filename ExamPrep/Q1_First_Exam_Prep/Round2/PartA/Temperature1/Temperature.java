package ExamPrep.Q1_First_Exam_Prep.Round2.PartA.Temperature1;

class Temperature {
    private double value;
    private String unit;


    protected Temperature(double value) {
        this.value = value;
        this.unit = "Celcius";
    }

    protected Temperature(double value, String unit){
        this.value = value;
        this.unit = unit;
    }


    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }


    protected double inCelsius(){
        if (this.unit.equals("Fahrenheit")){
            return this.value*1.8+32;
        }
        return -999;
    }
    protected double inFahrenheit(){
        if (this.unit.equals("Celsius")){
            return (this.value-32)/1.8;
        }
        return -999;
    }

    protected boolean istUnterNull(){
        return this.value < 0;
    }


}
