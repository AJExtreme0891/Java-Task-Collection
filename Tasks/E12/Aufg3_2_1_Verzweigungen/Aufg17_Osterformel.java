package Tasks.E12.Aufg3_2_1_Verzweigungen;

import java.util.Scanner;

public class Aufg17_Osterformel {
    public static String getEasterDate(int z){
        int m = 0;
        int n = 0;
        String answer ="";


        if (z >= 1533 && z <= 1699){
            m = 22;
            n = 2;
        } else if (z >= 1700 && z <= 1799) {
            m = 23;
            n= 3;
        }else if (z >= 1800 && z <= 1899) {
            m = 23;
            n = 4;
        } else if (z >= 1900 && z <= 2099) {
            m = 24;
            n = 5;
        } else if (z >= 2100 && z <= 2199) {
            m = 24;
            n = 6;
        } else if (z >= 2200 && z <= 2299) {
            m = 25;

        }


        int a = z%19;
        int b = z%4;
        int c = z % 7;
        int d = (m+19*a)%30;
        int e = (n+2*b+4*c+6*d)%7;
        int date = d+e+22;


        if(date > 31){
            date = d+e-9;
            if (date == 26){
                date = 19;
            }

            if (date == 25 && d == 28 && c == 6 && a > 10){
                date = 18;

            }

        }
        answer = "Ostern findet im Jahr " + z + " am " + date + " März statt.";

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Name a year between 1533 and 2299: ");
        int year = sc.nextInt();
        if (year < 1533 || year > 2299){
            System.out.println("Year not within parameters");
        }else System.out.println(getEasterDate(year));

    }
}
