package Tasks.E12.ArrayAufgaben;
import java.util.Scanner;
public class Array2Aufg5_Two_Simultanious {
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Start: ");
        int start_goal = sc.nextInt();

        int[] field1 = new int[start_goal+1];
        int[] field2 = new int[start_goal+1];


        for (int i = 0; i < field1.length; i++) {
            field1[i] = i ;
            field2[i] = -(start_goal) + i;
        }
        System.out.println("Array1: ");
        for(int i : field1){
            System.out.print(i + ", ");
        }
        System.out.println("\nArray2: ");
        for (int i : field2){
            System.out.print(i+ ", ");
        }


    }
}
