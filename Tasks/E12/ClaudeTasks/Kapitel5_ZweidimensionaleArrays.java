package Tasks.E12.ClaudeTasks;

public class Kapitel5_ZweidimensionaleArrays {

    public static void main(String[] args){
        int[][] m = {
                {1,6,1,7},
                {6,357,1,45},
                {15,732,12,2}
        };
        ausgabeFormatiert(m,3);
    }
    public static void makeMatrix(){
        int[][] matrix = {
                {0,0,0},
                {0,0,0},
                {0,0,7}
        };
    }
    public static void ausgabeFormatiert(int[][] m, int breite){
        for (int[] num : m) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%" + breite + "d,", num[j]);
            }
            System.out.println("");
        }
    }
    public static int[][] erzeugeKonstante(int zeilen, int spalten, int wert){
        int[][] matrix = new int[spalten][zeilen];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; i++){
                matrix[i][j]=wert;
            }
        }
        return matrix;
    }

}
