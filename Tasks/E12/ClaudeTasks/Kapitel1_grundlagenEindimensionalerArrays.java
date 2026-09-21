package Tasks.E12.ClaudeTasks;

public class Kapitel1_grundlagenEindimensionalerArrays {
    public static int summe(int[] werte){
        int sum = 0;
        for(int j : werte){
            sum += j;
        }
        return sum;
    }
    public static int minimum(int[] werte){
        int smallest = werte[0];
        for(int j : werte){
            if(j < smallest){
                smallest = j;
            }
        }
        return smallest;
    }
    public static int sucheLinear(int[] werte, int gesucht){
        int hold = -1;
        for (int i = 0; i < werte.length; i++){
            if(werte[i] == gesucht){
                hold = i;
            }
        }
        return hold;
    }
    public static int[] umkehren(int[] werte){
        int[] reverse = new int[werte.length];
        
        for (int i = werte.length-1; i <= 0; i--){
            int j = 0;
            reverse[j] = werte[i];
            j++;
        }
        return reverse;
    }
    public static void stepCounter(){
        int [] schritte = new int[7];
        
    }
    public static int wochensumme(int[] schritte){
        return summe(schritte);
    }
    public static int tagMitMax(int[] schritte){
        int max = schritte[0];
        for(int j : schritte){
            if(j > max){
                max = j;
            }
        }
        return max;
    }
    
}