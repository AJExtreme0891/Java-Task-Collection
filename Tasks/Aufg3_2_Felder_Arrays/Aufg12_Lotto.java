package Tasks.Aufg3_2_Felder_Arrays;

import java.util.Random;

public class Aufg12_Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {
            int neueZahl = random.nextInt(1, 50);
            boolean doppelt = false;


            for (int j = 0; j < i; j++) {
                if (lotto[j] == neueZahl) {
                    doppelt = true;
                    break;
                }
            }

            if (doppelt) {
                i--;
            } else {
                lotto[i] = neueZahl;
            }
        }

        System.out.println("Deine Zahlen sind: ");
        for (int zahl : lotto) {
            System.out.println(zahl);
        }
    }
}
