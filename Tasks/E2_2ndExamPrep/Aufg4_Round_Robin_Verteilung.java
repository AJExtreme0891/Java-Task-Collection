package Tasks.E2_2ndExamPrep;

import java.util.Arrays;

public class Aufg4_Round_Robin_Verteilung {
    public static int personFuerAufgabeint(int aufgabenNr, int personen){
        if(personen <= 0){
            return -1;
        }

        return aufgabenNr % personen;
    }
    public static int[] verteile(int[] aufgaben, int personen){
        int[] verteilt = new int[aufgaben.length];


        for (int i = 0; i<aufgaben.length; i++){
            verteilt[i] = personFuerAufgabeint(i, personen);
        }

        return verteilt;
    }

    public static void main(String[] args){
        int[] field = {10,20,30,40,50};

        System.out.println(Arrays.toString(verteile(field, 3)));
    }
}
