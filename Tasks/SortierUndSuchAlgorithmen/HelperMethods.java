package Tasks.SortierUndSuchAlgorithmen;

import ExamPrep.Q1_First_Exam_Prep.Challenge3.Sensor;

public class HelperMethods {
    public static int[] frontHalfOfF(int[] f) {

        int mitte = f.length / 2;
        int[] result = new int[mitte];

        for (int i = 0; i < mitte; i++) {
            result[i] = f[i];
        }

        return result;
    }


    public static int[] backHalfOfF(int[] f) {

        int mitte = f.length / 2;
        int[] result = new int[f.length - mitte];

        for (int i = mitte; i < f.length; i++) {
            result[i - mitte] = f[i];
        }

        return result;
    }
    public static Sensor[] frontHalfOfF(Sensor[] f) {

        int mitte = f.length / 2;
        Sensor[] result = new Sensor[mitte];

        for (int i = 0; i < mitte; i++) {
            result[i] = f[i];
        }

        return result;
    }


    public static Sensor[] backHalfOfF(Sensor[] f) {

        int mitte = f.length / 2;
        Sensor[] result = new Sensor[f.length - mitte];

        for (int i = mitte; i < f.length; i++) {
            result[i - mitte] = f[i];
        }

        return result;
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


    public static void vertausche(int[] f, int i) {

        int hold = f[i];
        f[i] = f[i + 1];
        f[i + 1] = hold;
    }


    public static void vertausche(int[] f, int i, int j) {

        int hold = f[i];
        f[i] = f[j];
        f[j] = hold;
    }

    public static void vertausche(Sensor[] f, int i) {

        Sensor hold = f[i];
        f[i] = f[i + 1];
        f[i + 1] = hold;
    }


    public static void vertausche(Sensor[] f, int i, int j) {

        Sensor hold = f[i];
        f[i] = f[j];
        f[j] = hold;
    }

    public static void vertausche(String[] f, int i) {

        String hold = f[i];
        f[i] = f[i + 1];
        f[i + 1] = hold;
    }


    public static void vertausche(String[] f, int i, int j) {

        String hold = f[i];
        f[i] = f[j];
        f[j] = hold;
    }

    public static String[] frontHalfOfF(String[] f) {

        int mitte = f.length / 2;
        String[] result = new String[mitte];

        for (int i = 0; i < mitte; i++) {
            result[i] = f[i];
        }

        return result;
    }


    public static String[] backHalfOfF(String[] f) {

        int mitte = f.length / 2;
        String[] result = new String[f.length - mitte];

        for (int i = mitte; i < f.length; i++) {
            result[i - mitte] = f[i];
        }

        return result;
    }







}
