package ExamPrep.E2_2ndExamPrep;

import java.util.Scanner;

public class Aufg2_Schaltjahr {
    public static boolean istSchaltjahr(int year){
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        return leapYear;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Name a year: ");
            int year = sc.nextInt();

            System.out.println(year + " ist ein Schaltjahr: " + istSchaltjahr(year));

            System.out.println("Continue?: ");
            String answer = sc.next();
            answer = answer.toLowerCase();
            if(answer.equals("no")){
                break;
            }
        }

    }
}
