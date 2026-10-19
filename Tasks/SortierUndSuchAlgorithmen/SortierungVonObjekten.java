package Tasks.SortierUndSuchAlgorithmen;

import static ExamPrep.Q1_First_Exam_Prep.Challenge3.Sensor.sortObjects;
import static Tasks.SortierUndSuchAlgorithmen.HelperMethods.vertausche;
import ExamPrep.Q1_First_Exam_Prep.Challenge3.*;
import ExamPrep.Q1_First_Exam_Prep.Challenge3.Sensor.*;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortierungVonObjekten {

    public static void main(String[] args) {
        Sensor[] sensors = {
                new Sensor("l", 100, 123),
                new Sensor("B", 122, 12),
                new Sensor("z", 1299, 23),
                new Sensor("s", -122, 153),
                new Sensor("A", -12, 109),
                new Sensor("A", -10, 60),
                new Sensor("ö", 50, 18),
                new Sensor("A", 68, 41),
                new Sensor("i", 66, 72),
                new Sensor("w", -200, 115),
                new Sensor("d", 88, 884),
                new Sensor("t", 43, -16),
                new Sensor("x", 123, 89),
                new Sensor("c", 31, 91),

        };


            System.out.println("Original: ");
            printObjectArray(sensors);


            sortObjects(sensors, "name");
            System.out.println("\nSorted by Name: ");
            printObjectArray(sensors);


            sortObjects(sensors, "temp");
            System.out.println("\nSorted by Temperature: ");
            printObjectArray(sensors);


            sortObjects(sensors, "pressure");
            System.out.println("\nSorted by Pressure: ");
            printObjectArray(sensors);
        }




    public static Sensor[] remake(ArrayList<Sensor> f){
        Sensor[] result = new Sensor[f.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = f.get(i);
        }

        result = (Sensor[]) f.clone();

        return result;
    }

    public static void printObjectArray(Sensor[] sensors){
        for (Sensor sensor : sensors){
            System.out.println("Sensor: [" + sensor.getName() + ", " + sensor.getTemperatur() + ", " + sensor.getPressure() + "]");
        }

    }
}
