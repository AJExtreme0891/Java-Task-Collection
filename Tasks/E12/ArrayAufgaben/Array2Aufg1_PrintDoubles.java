
import java.util.Random;
import java.util.Scanner;
public class Array2Aufg1_PrintDoubles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many random numbers:");
        int num = sc.nextInt();

        double[] fieldDouble = new double[num];
        Random random = new Random();

        // fill array and calculate sum
        for (int i = 0; i < num; i++) {
            
            fieldDouble[i] = Math.round(random.nextDouble(1,11)*100)/100.0;
        }

        System.out.print("Array: \n");
        for(int i = 0; i < fieldDouble.length; i++){
            System.out.println(fieldDouble[i]);
        }
    }
    
}