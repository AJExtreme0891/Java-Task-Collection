package Tasks.Aufg3_2_1_Verzweigungen;

import java.util.Arrays;
import java.util.Scanner;

public class Aufg15_Kreisgleichung {
    public static String proofPoint(String values){
        String[] valueField = values.split(" ");
        double a = Double.parseDouble(valueField[0]);
        double b = Double.parseDouble(valueField[1]);
        double r = Double.parseDouble(valueField[2]);
        double x = Double.parseDouble(valueField[3]);
        double y = Double.parseDouble(valueField[4]);
        String answer;
        double compare = ((x-a)*(x-a)) + ((y-b)*(y-b));
        if (compare == r*r){
            answer = "Point is on the circle";
        } else if (compare < r*r) {
            answer = "Point is within the circle";
        } else if (compare > r*r) {
            answer = "Point is outside the circle";
        }else answer = "Your values caused an issue";

        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a; b ; r; x and y in the aforementioned order seperated by spaces: ");
        String values = sc.next();


        System.out.println(proofPoint(values));
    }
}
