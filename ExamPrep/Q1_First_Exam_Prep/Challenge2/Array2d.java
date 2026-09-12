package ExamPrep.Q1_First_Exam_Prep.Challenge2;

import java.util.ArrayList;

public class Array2d {

    public static void main(String[] args) {
        int[][] feld = {
                {15},
                {1,2,3},
                {5,0,1},
                {7,3,5},
                {2,4,9},
                {1,3,1,10},
                {15},
                {0,1,2,1,1},
                {5,5,5}
        };

        int[] result = zeilenMitMaximum(feld);
        String print = "{";
        for (int i = 0; i < result.length-1; i++) {
            print = print + (result[i] + ", ");
        }
        print = print + (result[result.length-1] + "}");

        System.out.println(print);

    }



    public static int zeilenSumme(int[][] feld, int zeile){
        int hold = 0;
        for (int i = 0; i < feld[zeile].length; i++) {
            hold += feld[zeile][i];
        }
        return hold;
    }


    public static int maxSumZeile(int[][] feld){
        int hold = feld[0][0];
        for (int i = 0; i < feld.length; i++) {
            if (zeilenSumme(feld, i) > hold){
                hold = zeilenSumme(feld,i);
            }
        }
        return hold;
    }

    public static int[] zeilenMitMaximum(int[][] feld){
        int maxSum = maxSumZeile(feld);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < feld.length; i++) {
            if (zeilenSumme(feld, i) == maxSum){
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        for (int i= 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
























}

