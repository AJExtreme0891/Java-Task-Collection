package Tasks.E12.Aufg3_2_Felder_Arrays;

import java.util.Scanner;
public class Aufg14_Klausur {
    
    public static void main(String[] args) {
        double sum = 0;
        String grades = "";
        int totalStudents = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <= 15; i++ ){
        System.out.println("How many have " + i + " points: ");
        int numgrades = sc.nextInt();
        sum += numgrades * i;
        grades += numgrades + "x" + i + "; ";
        totalStudents += numgrades;    
        }
    sum /= totalStudents;
    
    System.out.println("Here are all grade: ");
    System.out.println(grades +"\n");
    System.out.println("And your average is: " + Math.round(sum*100)/100.0);
    
    
    }
}