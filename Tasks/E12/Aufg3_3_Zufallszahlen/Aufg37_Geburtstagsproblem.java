package Tasks.E12.Aufg3_3_Zufallszahlen;

public class Aufg37_Geburtstagsproblem {
    public static void main(String[] args){
        System.out.println(bDayProbability(4));



    }
    public static double bDayProbability(int total){

       double probability = 0;

       probability = 1 - ((double) fakaulty(365) /fakaulty(365-total)*Math.pow(365,total));



        return probability;
    }

    public static long fakaulty(int x){
        long facaulty = 1;
        for (int i = x; i > 0; i--) {

            facaulty *= (i);

        }
        return facaulty;
    }


}
