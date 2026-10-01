package Tasks.SortierUndSuchAlgorithmen;

import java.util.Arrays;

import static Tasks.SortierUndSuchAlgorithmen.HelperMethods.*;
import static Tasks.SortierUndSuchAlgorithmen.HelperMethods.vertausche;

public class SortierungsalgorithmenMitStrings {


    public static void main(String[] args) {

        String[] numbers = {"g", "h", "b", "o", "l", "a", "c"};

        System.out.println("Original:       " + Arrays.toString(numbers));

        String[] bubble = numbers.clone();
        bubblesort(bubble);
        System.out.println("Bubble Sort:    " + Arrays.toString(bubble));

        String[] selection = numbers.clone();
        selectionsort(selection);
        System.out.println("Selection Sort: " + Arrays.toString(selection));

        String[] insertion = numbers.clone();
        insertionsort(insertion);
        System.out.println("Insertion Sort: " + Arrays.toString(insertion));

        String[] merge = numbers.clone();
        merge = mergesort(merge);
        System.out.println("Merge Sort:     " + Arrays.toString(merge));


        String[] quick = numbers.clone();
        quicksort(quick, 0, (quick.length - 1));
        System.out.println("Quick Sort:     " + Arrays.toString(merge));
    }


    public static void bubblesort(String[] f) {

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


    public static void selectionsort(String[] f) {

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


    public static void insertionsort(String[] f) {

        for (int i = 1; i < f.length; i++) {

            String neu = f[i];
            int j = i - 1;

            while (j >= 0 && f[j].compareTo(neu) > 0) {
                f[j + 1] = f[j];
                j--;
            }

            f[j + 1] = neu;
        }
    }


    public static String[] mergesort(String[] f) {

        if (f.length <= 1) {
            return f;
        }

        String[] leftHalf = frontHalfOfF(f);
        String[] rightHalf = backHalfOfF(f);

        leftHalf = mergesort(leftHalf);
        rightHalf = mergesort(rightHalf);

        return mixArrays(leftHalf, rightHalf);
    }

    public static String[] mixArrays(String[] a, String[] b) {

        String[] result = new String[a.length + b.length];

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


    public static void quicksort(String[] f, int links, int rechts) {

        if (links < rechts) {

            int p = partitioniere(f, links, rechts);

            quicksort(f, links, p - 1);      // linker Teil
            quicksort(f, p + 1, rechts);     // rechter Teil
        }
    }


    public static int partitioniere(String[] f, int links, int rechts) {

        String pivot = f[rechts];
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
