import java.util.*;
public class SortList {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        // Ask how many numbers
        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        // Input numbers
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(scanner.nextDouble());
        }

        // Ask sorting order
        System.out.print("Sort ascending or descending? (a/d): ");
        char choice = scanner.next().toLowerCase().charAt(0);

        // Sort based on choice
        if (choice == 'a') {
            Collections.sort(numbers); // ascending
        } else if (choice == 'd') {
            Collections.sort(numbers, Collections.reverseOrder()); // descending
        } else {
            System.out.println("Invalid choice, defaulting to ascending.");
            Collections.sort(numbers);
        }

        // Output result
        System.out.println("Sorted numbers: " + numbers);

        
    }

    
}