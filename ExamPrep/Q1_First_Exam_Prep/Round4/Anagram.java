package ExamPrep.Q1_First_Exam_Prep.Round4;

import java.util.Locale;

public class Anagram {

    public static void main(String[] args) {

    }

    public static boolean istAnagramm(String a, String b) {
        a = a.toLowerCase().strip();
        b = b.toLowerCase().strip();


        char[] charsOfA = a.toCharArray();
        char[] charsOfB = b.toCharArray();
        char[]
        if (charsOfA.length != charsOfB.length) {
            return false;
            for (int i = 0; i < charsOfA.length; i++) {
                //if (charsOfA[])
            }
        }


    }

    public static int occurance(char[] chars, char a){
       int hold = 0;

       for (char c : chars){
           if (c==a){
               hold++;
           }
       }
        return hold;
    }
}




