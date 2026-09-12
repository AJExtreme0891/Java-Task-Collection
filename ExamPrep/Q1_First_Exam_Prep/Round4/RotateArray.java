package ExamPrep.Q1_First_Exam_Prep.Round4;

public class RotateArray {


    public static void main(String[] args) {
        int[][] m = {
                {1,2,3,5},
                {4,5,6,6}


        };

        int[][] result = turnby90degrees(m);
        printArray(m);

    }


    public static void printArray(int[][] m){
        for (int[] num : m){
            for (int number : num){
                System.out.print(number + ",");
            }
            System.out.println();
        }
    }
    public static int[][] turnby90degrees(int[][]m){
        int[][] result = new int[m[0].length][m.length];

        for (int j = 0; j < m.length; j++) {
            for (int i = 0; i < m[0].length; i++) {
                result[i][j] = m[(m.length-1)-j][i];

            }
        }
        return result;
    }
}
