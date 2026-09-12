package ExamPrep.Q1_First_Exam_Prep.RoundOne;

public class Laboritory {

    protected static void main(String[] args) {
        Sensor[] sensoren = new Sensor[6];

        sensoren[0] = new Sensor("A", 21.5);
        sensoren[1] = null;
        sensoren[2] = new Sensor("B", 37.2);
        sensoren[3] = new Sensor("C", 18.4);
        sensoren[4] = null;
        sensoren[5] = new Sensor("D", 42.1);
    }



    protected double durchschnittsTemperatur(Sensor[] sensors){
        double average = 0;
        int hold = 0;
        for(Sensor sensor : sensors){
            if (sensor != null){
                hold++;
                average += sensor.getTemperatur();
            }
        }
        average = Math.round((average/hold)*100) / 100.0;
        return average;
    }


    protected Sensor sucheHeissesten(Sensor[] sensors){
        Sensor hottest = sensors[0];

        for (Sensor sensor : sensors){
            if (sensor != null){
                if (sensor.getTemperatur() > hottest.getTemperatur()){
                    hottest = sensor;
                }
            }
        }
        return hottest;
    }
}
