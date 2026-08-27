package Tasks.Aufg3_2_Felder_Arrays;

public class Aufg17_Pascalsches_Dreieck {
    public static void main(String[] args){
        zeichneDreieck(10);



    }

    public static void zeichneDreieck(int zeilen){

        int[][] dreieck = new int[zeilen][zeilen];

        for (int i = 0; i < zeilen; i++) {


            dreieck[i][0] = 1;
            dreieck[i][i] = 1;


            for (int j = 1; j < i; j++) {

                dreieck[i][j] = dreieck[i - 1][j - 1] + dreieck[i - 1][j];

            }
        }


        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < zeilen - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(dreieck[i][j] + " ");

            }


            System.out.println();
        }


    }
}
