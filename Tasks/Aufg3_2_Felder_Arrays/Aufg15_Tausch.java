package Tasks.Aufg3_2_Felder_Arrays;

import java.util.Random;

public class Aufg15_Tausch {

    public static void main(String[] args) {
        int[] feld = new int[10];
        Random rand = new Random();

        
        for (int i = 0; i < feld.length; i++) {
            feld[i] = rand.nextInt(9) + 1;
        }

        System.out.println("Original:");
        printArray(feld);

        // Methode aufrufenwg
        int[] getauscht = tauschen(feld);

        System.out.println("Nach dem Tausch:");
        printArray(getauscht);
    }

    
    public static int[] tauschen(int[] array) {
        Random rand = new Random();

        // zufällige Trennstelle (nicht 0 oder 10!)
        int trenn = rand.nextInt(array.length - 1) + 1;

        System.out.println("Trennstelle bei Index: " + trenn);

        int[] neu = new int[array.length];

        int index = 0;

        // Teil 2 zuerst
        for (int i = trenn; i < array.length; i++) {
            neu[index++] = array[i];
        }

        // dann Teil 1
        for (int i = 0; i < trenn; i++) {
            neu[index++] = array[i];
        }

        return neu;
    }

    // Hilfsmethode zum Ausgeben
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}