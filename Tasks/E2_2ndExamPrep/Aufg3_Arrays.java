package Tasks.E2_2ndExamPrep;
import java.util.Random;
public class Aufg3_Arrays {
    public static int summe(int[] werte){
        int sum = 0;
        for (int wert : werte){
            sum += wert;
        }
        return sum;
    }
    public static int maximum(int[] werte){
        int largest = 0;
        for(int wert : werte){
            if(wert > largest){
                largest = wert;
            }
        }
        return largest;
    }
    public static int positionVon(int[] werte, int gesucht){
        int hold = -1;
        for (int i = 0; i < werte.length; i++ ){
            if(werte[i] == gesucht){
                hold = i;
                break;
            }
        }
        return hold;
    }
    public static int[] geradeWerte(int[] werte){
        int hold = 0;
        for(int wert : werte){
            if (wert % 2 == 0){
                hold++;
            }
        }
        int[] evens = new int[hold];
        hold = 0;
        for(int wert : werte){
            if (wert % 2 == 0 && wert != 0){
                evens[hold] = wert;
                hold++;
            }
        }
        return evens;
    }


    public static void main(String[]args){
        int[] field = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            field[i] = random.nextInt(0,11);
        }
        System.out.println("Original Array: ");

        for (int num : field){
            System.out.print(num + ", ");
        }
        int value = random.nextInt(0,11);

        System.out.println();
        System.out.println("Sum of Array: " + summe(field));
        System.out.println("Max number of Array: " + maximum(field));
        System.out.println("Position of " + value + " in Array: " + positionVon(field, value));
        System.out.println("Evens in Array: ");
        for (int num : geradeWerte(field)){
            System.out.print(num + ", ");
        }


    }

}
