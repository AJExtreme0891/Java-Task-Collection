package ExamPrep.Q1_First_Exam_Prep.Challenge3;

import java.util.ArrayList;


public class Laboritory {
    public static void main(String[] args) {
        ArrayList<Sensor> sensoren = new ArrayList<Sensor>();

        sensoren.add(new Sensor("A", 21.5));
        sensoren.add(null);
        sensoren.add(new Sensor("B", 57.2));
        sensoren.add(new Sensor("C", 18.4));
        sensoren.add(null);
        sensoren.add(new Sensor("D", 42.1));

        if (sucheZweitHeissesten(sensoren) == null) {
            System.out.println("Maybe try adding sensors");
        } else {
            System.out.println(sucheHottest(sensoren,null).getName());
            System.out.println(sucheHottest(sensoren,sucheHottest(sensoren,null)).getName());
        }

    }


    protected static Sensor sucheZweitHeissesten(ArrayList<Sensor> sensors) {



        return sucheHottest(sensors,sucheHottest(sensors,null));
    }

    protected static Sensor sucheHottest(ArrayList<Sensor> sensors, Sensor buffer ){
        Sensor hottest = buffer;
        Sensor currentHottest = null;
        for (Sensor sensor : sensors) {
            if (sensor != null) {

                if (currentHottest == null || (currentHottest.getTemperatur() < sensor.getTemperatur() && (hottest == null || hottest.getTemperatur() != sensor.getTemperatur()))) {

                    currentHottest = sensor;
                }

            }
        }
        return currentHottest;
    }
}
