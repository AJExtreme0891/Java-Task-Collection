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



        System.out.println("<----- Sorted with Bubblesort---->");
        Sensor[] bubble = sensors.clone();
        sortObjects(bubble, "name", "bubble");
        System.out.println("\nSorted by Name: ");
        printObjectArray(bubble);


        sortObjects(bubble, "temp", "bubble");
        System.out.println("\nSorted by Temperature: ");
        printObjectArray(bubble);


        sortObjects(bubble, "pressure", "bubble");
        System.out.println("\nSorted by Pressure: ");
        printObjectArray(bubble);

        System.out.println(" ");
        System.out.println(" ");


        System.out.println("<----- Sorted with Selectionsort---->");
        Sensor[] selection = sensors.clone();
        sortObjects(selection, "name", "selection");
        System.out.println("\nSorted by Name: ");
        printObjectArray(selection);


        sortObjects(selection, "temp", "selection");
        System.out.println("\nSorted by Temperature: ");
        printObjectArray(selection);


        sortObjects(selection, "pressure", "selection");
        System.out.println("\nSorted by Pressure: ");
        printObjectArray(selection);



        System.out.println(" ");
        System.out.println(" ");


        System.out.println("<----- Sorted with Merge sort---->");
        Sensor[] merge = sensors.clone();
        sortObjects(merge, "name", "merge");
        System.out.println("\nSorted by Name: ");
        printObjectArray(merge);


        sortObjects(merge, "temp", "merge");
        System.out.println("\nSorted by Temperature: ");
        printObjectArray(merge);


        sortObjects(merge, "pressure", "merge");
        System.out.println("\nSorted by Pressure: ");
        printObjectArray(merge);


        System.out.println(" ");
        System.out.println(" ");


        System.out.println("<----- Sorted with insertion sort---->");
        Sensor[] insertion = sensors.clone();
        sortObjects(insertion, "name", "insertion");
        System.out.println("\nSorted by Name: ");
        printObjectArray(insertion);


        sortObjects(insertion, "temp", "insertion");
        System.out.println("\nSorted by Temperature: ");
        printObjectArray(insertion);


        sortObjects(insertion, "pressure", "insertion");
        System.out.println("\nSorted by Pressure: ");
        printObjectArray(insertion);


        System.out.println(" ");
        System.out.println(" ");


        System.out.println("<----- Sorted with quick sort---->");
        Sensor[] quick = sensors.clone();
        sortObjects(quick, "name", "quick");
        System.out.println("\nSorted by Name: ");
        printObjectArray(quick);


        sortObjects(quick, "temp", "quick");
        System.out.println("\nSorted by Temperature: ");
        printObjectArray(quick);


        sortObjects(quick, "pressure", "quick");
        System.out.println("\nSorted by Pressure: ");
        printObjectArray(quick);


        System.out.println(" ");
        System.out.println(" ");


        System.out.println("<----- Error Case ---->");
        sortObjects(sensors, "something", "whatever");
        System.out.println(" ");
        printObjectArray(sensors);
    }


    public static Sensor[] remake(ArrayList<Sensor> f) {
        Sensor[] result = new Sensor[f.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = f.get(i);
        }

        result = (Sensor[]) f.clone();

        return result;
    }

    public static void printObjectArray(Sensor[] sensors) {
        for (Sensor sensor : sensors) {
            System.out.println("Sensor: [" + sensor.getName() + ", " + sensor.getTemperatur() + ", " + sensor.getPressure() + "]");
        }

    }
}
