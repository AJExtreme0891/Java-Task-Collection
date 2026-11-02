package Tasks.SortierUndSuchAlgorithmen;



import ExamPrep.Q1_First_Exam_Prep.Challenge3.Sensor;
import Tasks.Classes.MicsClasses.Konto;

import java.util.Comparator;


import static Tasks.SortierUndSuchAlgorithmen.HelperMethods.*;
import static Tasks.SortierUndSuchAlgorithmen.HelperMethods.vertausche;

public class SortObjectsWithComparable {
    public static void main(String[] args) {
        Konto[] kontos = {
                new Konto("Bob", 806),
                new Konto("Steve", 1000),
                new Konto("Dinnerbone", 12),
                new Konto("jeb", 500),
                new Konto("Alex", 1256),
                new Konto("Mojang", 158619),
                new Konto("Schaaf", 1),
                new Konto("Vindicator", 100000),
                new Konto("Villager", -124),
                new Konto("Johnny", 9997)
        };



        System.out.println("Original: ");
        printObjectArray(kontos);



        System.out.println("<----- Sorted with Bubblesort---->");
        Konto[] bubble = kontos.clone();
        sortObjects(bubble, "bubble");
        System.out.println("\nSorted by Name: ");
        printObjectArray(bubble);


        System.out.println(" ");
        System.out.println(" ");


        System.out.println("<----- Sorted with Selectionsort---->");
        Konto[] selection = kontos.clone();
        sortObjects(selection, "selection");
        System.out.println("\nSorted by Name: ");
        printObjectArray(selection);

        System.out.println(" ");
        System.out.println(" ");


        System.out.println("<----- Sorted with Merge sort---->");
        Konto[] merge = kontos.clone();
        sortObjects(merge, "merge");
        System.out.println("\nSorted by Name: ");
        printObjectArray(merge);




        System.out.println(" ");
        System.out.println(" ");


        System.out.println("<----- Sorted with insertion sort---->");
        Konto[] insertion = kontos.clone();
        sortObjects(insertion, "insertion");
        System.out.println("\nSorted by Name: ");
        printObjectArray(insertion);



        System.out.println(" ");
        System.out.println(" ");


        System.out.println("<----- Sorted with quick sort---->");
        Konto[] quick = kontos.clone();
        sortObjects(quick, "quick");
        System.out.println("\nSorted by Name: ");
        printObjectArray(quick);



        System.out.println("<----- Error Case ---->");
        sortObjects(kontos, "whatever");
        System.out.println(" ");
        printObjectArray(kontos);

    }

    public static void printObjectArray(Konto[] kontos) {
        for (Konto konto : kontos) {
            System.out.println("Konto: [" + konto.getInhaber() + ", " + konto.getKontostand() + "]");
        }

    }


    public static void sortObjects(Konto[] f, String sortWith) {

        sortWith = sortWith.toLowerCase().strip();



        switch (sortWith){
            case "bubble" :
                bubblesort(f);
                break;
            case "selection" :
                selectionsort(f);
                break;
            case "insertion" :
                insertionsort(f);
                break;
            case "merge" :
                mergesort(f );
                break;
            case "quick" :
                quicksort(f,0,(f.length-1));
                break;
            default:
                System.out.println("Type either 'bubble', 'selection', 'insertion', 'merge' or 'quick'. Your input was: " + sortWith);

        }

    }


    public static void bubblesort(Konto[] f) {

        boolean vertauscht;

        do {
            vertauscht = false;

            for (int i = 0; i < f.length - 1; i++) {

                if (f[i].compareTo(f[i+1]) > 0) {
                    vertausche(f, i);
                    vertauscht = true;
                }
            }

        } while (vertauscht);
    }


    public static void selectionsort(Konto[] f) {

        for (int i = 0; i < f.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < f.length; j++) {

                if (f[j].compareTo(f[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                vertausche(f, i, minIndex);
            }
        }
    }


    public static void insertionsort(Konto[] f) {

        for (int i = 1; i < f.length; i++) {

            Konto neu = f[i];
            int j = i - 1;

            while (j >= 0 && f[j].compareTo(neu) > 0) {
                f[j + 1] = f[j];
                j--;
            }

            f[j + 1] = neu;
        }
    }


    public static Konto[] mergesort(Konto[] f) {

        if (f.length <= 1) {
            return f;
        }

        Konto[] leftHalf = frontHalfOfF(f);
        Konto[] rightHalf = backHalfOfF(f);


        Konto[] sortedResult = mixArrays(mergesort(leftHalf), mergesort(rightHalf));

        for (int i = 0; i < f.length; i++) {
            f[i] = sortedResult[i];
        }


        return f;
    }

    public static Konto[] mixArrays(Konto[] a, Konto[] b) {

        Konto[] result = new Konto[a.length + b.length];

        int ia = 0;
        int ib = 0;
        int i = 0;

        while (ia < a.length && ib < b.length) {

            if (a[ia].compareTo(b[ib]) <= 0) {
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


    public static void quicksort(Konto[] f, int links, int rechts) {

        if (links < rechts) {

            int p = partitioniere(f, links, rechts);

            quicksort(f, links, p - 1);      // linker Teil
            quicksort(f, p + 1, rechts);     // rechter Teil
        }
    }


    public static int partitioniere(Konto[] f, int links, int rechts) {

        Konto pivot = f[rechts];
        int grenze = links;

        for (int i = links; i <= rechts - 1; i++) {

            if (f[i].compareTo(pivot) < 0) {

                vertausche(f, i, grenze);
                grenze++;
            }
        }

        vertausche(f, grenze, rechts);

        return grenze;
    }

}
