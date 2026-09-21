//package Tasks.E12.IntermediateJavaWithLoops;


import java.util.ArrayList;
import java.util.Scanner;

public class MethodsAndStuff {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String answer = "yes";

       
        
        do{System.out.println("Number: ");
            int number = sc.nextInt();
            numbers.add(number);
            System.out.print("Noch eine Zahl: ");
            answer = sc.next();
            answer = answer.toLowerCase();            
        }while(answer.equals("yes"));
            
        System.out.println("Dein durchscnitt ist " + berechneDurchschnitt(numbers));

        System.out.println("\n");
        gibHalloAus();
        System.out.println("\n");
        begruessePerson("Andre","Ellerbrock");
        System.out.println("\n");
        System.out.println("\nHow large should the triangle be: ");
        int size = sc.nextInt();
        zeichneDreieck(size);




    }


    public static void gibHalloAus() {
        System.out.println("Hallo Welt!");
    } //Methods Auf1

    public static void begruessePerson(String firstName, String lastName) { //Methods Auf2
        System.out.println("Hallo " + firstName + " " + lastName);

    }


    public static double berechneDurchschnitt(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.size();
        return Math.round(average * 100) / 100.0;
    }


    public static void zeichneDreieck(int size){
        for (int i = 1; i <= size; i++) {

            // spaces before the stars
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }



//    public static void zeichneDreieck(int size){ //lazy version
//        for (int i = 1; i <= size ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }
//
//
//    }


}



