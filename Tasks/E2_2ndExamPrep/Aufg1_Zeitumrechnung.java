package Tasks.E2_2ndExamPrep;



import java.util.Scanner;

public class Aufg1_Zeitumrechnung {
    public static int hours(int seconds){
        return seconds / 3600;
    }
    public static int minutes(int time){
        int change = time % 3600;
        return change/60;
    }
    public static int restSekunden(int time){
        return time % 60;
    }

    public static String timeStamp(int time){
        int hours = hours(time);
        int mins = minutes(time);
        int seconds = restSekunden(time);
        return hours + "h " + mins + "min " + seconds + "s";
    }

    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] times = {0,59,60,3599,3600,86399};
//        System.out.println("Time in seconds: ");
//        int time = sc.nextInt();

        for (int time : times){

            System.out.println("Timestamp For Time " + time + ": " +timeStamp(time));
        }


    }
}




