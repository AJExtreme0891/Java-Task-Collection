package Tasks.SortierUndSuchAlgorithmen;

import java.util.Arrays;

import static Tasks.SortierUndSuchAlgorithmen.HelperMethods.*;


public class Sortierungsalgorithmen {

    public static void main(String[] args) {

        int[] numbers = {1, 5, 5, 1, 6, 58, 287};

        System.out.println("Original:       " + Arrays.toString(numbers));

        int[] bubble = numbers.clone();
        bubblesort(bubble);
        System.out.println("Bubble Sort:    " + Arrays.toString(bubble));

        int[] selection = numbers.clone();
        selectionsort(selection);
        System.out.println("Selection Sort: " + Arrays.toString(selection));

        int[] insertion = numbers.clone();
        insertionsort(insertion);
        System.out.println("Insertion Sort: " + Arrays.toString(insertion));

        int[] merge = numbers.clone();
        merge = mergesort(merge);
        System.out.println("Merge Sort:     " + Arrays.toString(merge));


        int[] quick = numbers.clone();
        quicksort(quick, 0, (quick.length - 1));
        System.out.println("Quick Sort:     " + Arrays.toString(merge));
    }


    public static void bubblesort(int[] f) {

        boolean vertauscht;

        do {
            vertauscht = false;

            for (int i = 0; i < f.length - 1; i++) {

                if (f[i] > f[i + 1]) {
                    vertausche(f, i);
                    vertauscht = true;
                }
            }

        } while (vertauscht);
    }


    public static void selectionsort(int[] f) {

        for (int i = 0; i < f.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < f.length; j++) {

                if (f[j] < f[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                vertausche(f, i, minIndex);
            }
        }
    }


    public static void insertionsort(int[] f) {

        for (int i = 1; i < f.length; i++) {

            int neu = f[i];
            int j = i - 1;

            while (j >= 0 && f[j] > neu) {
                f[j + 1] = f[j];
                j--;
            }

            f[j + 1] = neu;
        }
    }


    public static int[] mergesort(int[] f) {

        if (f.length <= 1) {
            return f;
        }

        int[] leftHalf = frontHalfOfF(f);
        int[] rightHalf = backHalfOfF(f);

        leftHalf = mergesort(leftHalf);
        rightHalf = mergesort(rightHalf);

        return mixArrays(leftHalf, rightHalf);
    }

    public static int[] mixArrays(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        int ia = 0;
        int ib = 0;
        int i = 0;

        while (ia < a.length && ib < b.length) {

            if (a[ia] <= b[ib]) {
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





    public static void quicksort(int[] f, int links, int rechts) {

        if (links < rechts) {

            int p = partitioniere(f, links, rechts);

            quicksort(f, links, p - 1);      // linker Teil
            quicksort(f, p + 1, rechts);     // rechter Teil
        }
    }


    public static int partitioniere(int[] f, int links, int rechts) {

        int pivot = f[rechts];
        int grenze = links;

        for (int i = links; i <= rechts - 1; i++) {

            if (f[i] < pivot) {

                vertausche(f, i, grenze);
                grenze++;
            }
        }

        vertausche(f, grenze, rechts);

        return grenze;
    }


}