package Tasks.Aufg3_2_Felder_Arrays;

import java.util.ArrayList;

import java.util.Scanner;

public class Aufg11_SiebDesEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("How many numbers:");
        int num = sc.nextInt();


        

        for (int i = 1; i <= num; i++) {
            numbers.add(i);
        }


        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }


        
        System.out.print("Array:");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }

    }
}


