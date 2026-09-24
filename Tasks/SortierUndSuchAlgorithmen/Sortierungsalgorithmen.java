package Tasks.SortierAlgorithmen;

public class Sortierungsalgorithmen {

    public static int[] vertausche(int[] f, int i) {
        int hold = f[i];
        f[i] = f[i + 1];
        f[i + 1] = hold;
        return f;
    }
    public static int[] vertausche(int[] f, int i, int j) {
        int hold = f[i];
        f[i] = f[j];
        f[j] = hold;
        return f;
    }

    public static void bubblesort(int[] f) {
        int hold = 0;
        int index = 1;
        boolean vertauscht;
        do {
            vertauscht = false;
            for (int i = 0; i < f.length - index; i++) {
                if (f[i] > f[i + 1]) {
                    f = vertausche(f, i);
                    vertauscht = true;

                }
            }
            index++;
        } while (vertauscht);
    }


    public static void selectionsort(int[] f) {

        for (int i = 0; i < f.length - 1; i++) {
            int minIndex = findSmallestInt(f, i);
            for (int j = 0; j + 1 < f.length - 1; j++) {
                if (f[j] < f[minIndex]) {
                    minIndex = j;
                }
            }
            f = vertausche(f,i,minIndex);
        }
    }


    public static int findSmallestInt(int[] f, int start) {
        int min = f[start];
        int index = -1;
        for (int i = start; i < f.length; i++) {
            if (f[i] < min) {
                min = f[i];
                index = i;
            }
        }
        return index;
    }

}
