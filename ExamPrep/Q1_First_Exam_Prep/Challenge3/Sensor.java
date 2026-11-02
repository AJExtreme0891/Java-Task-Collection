package ExamPrep.Q1_First_Exam_Prep.Challenge3;

import java.util.Comparator;

import static Tasks.SortierUndSuchAlgorithmen.HelperMethods.*;


public class Sensor {
    private String name;
    private double temperatur;
    private double pressure;

    public Sensor(String pName, double pTemperatur) {
        this.name = pName;
        this.temperatur = pTemperatur;
    }
    public Sensor(String pName, double pTemperatur, double pressure) {
        this.name = pName;
        this.temperatur = pTemperatur;
        this.pressure = pressure;
    }

    public String getName() {
        return this.name;
    }

    public double getTemperatur() {
        return this.temperatur;
    }
    public double getPressure(){
        return this.pressure;
    }




    public static void sortObjects(Sensor[] f, String sortBy, String sortWith) {
        sortBy = sortBy.toLowerCase().strip();
        sortWith = sortWith.toLowerCase().strip();

        Comparator<Sensor> comparator = null;

        switch (sortBy) {
            case "name":
                comparator = Comparator.comparing(s -> s.getName().toLowerCase());
                break;
            case "temp":
                comparator = Comparator.comparingDouble(Sensor::getTemperatur);
                break;
            case "pressure":
                comparator = Comparator.comparingDouble(Sensor::getPressure);
                break;
            default:
                System.out.println("Type either 'name', 'temp' or 'pressure'. Your input was: " + sortBy);


        }

        switch (sortWith){
            case "bubble" :
                bubblesort(f, comparator);
                break;
            case "selection" :
                selectionsort(f,comparator);
                break;
            case "insertion" :
                insertionsort(f, comparator);
                break;
            case "merge" :
                mergesort(f, comparator);
                break;
            case "quick" :
                quicksort(f,0,(f.length-1),comparator);
                break;
            default:
                System.out.println("Type either 'bubble', 'selection', 'insertion', 'merge' or 'quick'. Your input was: " + sortWith);

        }

    }


    private static void bubblesort(Sensor[] f, Comparator<Sensor> comparator) {
        boolean vertauscht;
        do {
            vertauscht = false;
            for (int i = 0; i < f.length - 1; i++) {
                // comparator.compare gibt eine Zahl > 0 zurück, wenn das linke Element größer ist als das rechte
                if (comparator.compare(f[i], f[i + 1]) > 0) {
                    vertausche(f, i);
                    vertauscht = true;
                }
            }
        } while (vertauscht);
    }

    public static void selectionsort(Sensor[] f, Comparator<Sensor> comparator) {

        for (int i = 0; i < f.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < f.length; j++) {

                if (comparator.compare(f[j], f[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                vertausche(f, i, minIndex);
            }
        }
    }

    public static void insertionsort(Sensor[] f, Comparator<Sensor> comparator) {

        for (int i = 1; i < f.length; i++) {

            Sensor neu = f[i];
            int j = i - 1;

            while (j >= 0 && comparator.compare(f[j], neu) > 0) {
                f[j + 1] = f[j];
                j--;
            }

            f[j + 1] = neu;
        }
    }


    public static Sensor[] mergesort(Sensor[] f, Comparator<Sensor> comparator) {

        if (f.length <= 1) {
            return f;
        }

        Sensor[] leftHalf = frontHalfOfF(f);
        Sensor[] rightHalf = backHalfOfF(f);

        Sensor[] sortedResult = mixArrays(mergesort(leftHalf, comparator), mergesort(rightHalf, comparator), comparator);

        for (int i = 0; i < f.length; i++) {
            f[i] = sortedResult[i];
        }


        return f;
    }

    public static Sensor[] mixArrays(Sensor[] a, Sensor[] b, Comparator<Sensor> comparator) {

        Sensor[] result = new Sensor[a.length + b.length];

        int ia = 0;
        int ib = 0;
        int i = 0;

        while (ia < a.length && ib < b.length) {

            if (comparator.compare(a[ia], b[ib]) >= 0) {
                result[i] = a[ia];
                ia++;
            } else {
                result[i] = b[ib];
                ib++;
            }

            i++;
        }

        while (ia < a.length) {
            result[i] = a[ia];
            ia++;
            i++;
        }

        while (ib < b.length) {
            result[i] = b[ib];
            ib++;
            i++;
        }

        return result;
    }


    public static void quicksort(Sensor[] f, int links, int rechts, Comparator<Sensor> comparator) {

        if (links < rechts) {

            int p = partitioniere(f, links, rechts, comparator);

            quicksort(f, links, p - 1, comparator);      // linker Teil
            quicksort(f, p + 1, rechts, comparator);     // rechter Teil
        }
    }


    public static int partitioniere(Sensor[] f, int links, int rechts, Comparator<Sensor> comparator) {

        Sensor pivot = f[rechts];
        int grenze = links;

        for (int i = links; i <= rechts - 1; i++) {

            if (comparator.compare(f[i], pivot) < 0) {

                vertausche(f, i, grenze);
                grenze++;
            }
        }

        vertausche(f, grenze, rechts);

        return grenze;
    }

/*
    public static void sortObjects(Sensor[] f, String sortBy){
        sortBy = sortBy.toLowerCase().strip();

        switch(sortBy){
            case "temp":
                bubblesortTemp(f);
                break;
            case "pressure":
                bubblesortPres(f);
                break;
            case "name":
                bubblesortName(f);
                break;
            default:
                System.out.println("Type either 'name', 'temp' or 'pressure'");

        }


    }
*/

    private static void bubblesortTemp(Sensor[] f) {

        boolean vertauscht;

        do {
            vertauscht = false;

            for (int i = 0; i < f.length - 1; i++) {

                if (f[i].getTemperatur() > f[i + 1].getTemperatur()) {
                    vertausche(f, i);
                    vertauscht = true;
                }
            }

        } while (vertauscht);
    }

    private static void bubblesortPres(Sensor[] f) {

        boolean vertauscht;

        do {
            vertauscht = false;

            for (int i = 0; i < f.length - 1; i++) {

                if (f[i].getPressure() > f[i + 1].getPressure()) {
                    vertausche(f, i);
                    vertauscht = true;
                }
            }

        } while (vertauscht);
    }



    private static void bubblesortName(Sensor[] f) {

        boolean vertauscht;

        do {
            vertauscht = false;

            for (int i = 0; i < f.length - 1; i++) {

                if (f[i].getName().toLowerCase().compareTo(f[i+1].getName().toLowerCase()) > 0) {
                    vertausche(f, i);
                    vertauscht = true;
                }
            }

        } while (vertauscht);
    }
}
