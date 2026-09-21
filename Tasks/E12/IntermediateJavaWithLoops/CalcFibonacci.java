package Tasks.E12.IntermediateJavaWithLoops;

import java.util.Scanner;

public class CalcFibonacci {

    // Methode für einzelne Fibonacci-Zahl
    public static int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1 || n == 2) return 1;

        int f1 = 1;
        int f2 = 1;
        int fn = 0;

        for (int i = 3; i <= n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }

        return fn;
    }

    // Methode für ganze Sequenz
    public static void printSequence(int n) {
        if (n <= 0) {
            System.out.println("Ungültige Eingabe");
            return;
        }

        int f1 = 1;
        int f2 = 1;

        if (n >= 1) System.out.print(f1 + " ");
        if (n >= 2) System.out.print(f2 + " ");

        for (int i = 3; i <= n; i++) {
            int fn = f1 + f2;
            System.out.print(fn + " ");
            f1 = f2;
            f2 = fn;
        }

        System.out.println();
    }

    public static void printCustomSequence(int n1, int n2, int iteration) {
        if (n1 <= 0 || n2 <= 0) {
            System.out.println("Ungültige Eingabe");
            return;
        }

        int f1 = n1;
        int f2 = n2;

        System.out.print(f1 + " " + f2 + " ");

        for (int i = 3; i <= iteration; i++) {
            int fn = f1 + f2;
            System.out.print(fn + " ");
            f1 = f2;
            f2 = fn;
        }

        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib eine Zahl n ein: ");
        int n = scanner.nextInt();

        // Einzelne Fibonacci-Zahl
        int result = fib(n);
        System.out.println("Fibonacci-Zahl f_" + n + " = " + result);

        // Ganze Sequenz
        System.out.print("Fibonacci-Sequenz bis n: ");
        printSequence(n);

        System.out.print("Gib deine erste Zahl n1 ein: ");
        int n1 = scanner.nextInt();

        System.out.print("Gib deine zweite Zahl n2 ein: ");
        int n2 = scanner.nextInt();

        System.out.print("Wie lange sollte die Sequenz sein: ");
        int iteration = scanner.nextInt();
        System.out.print("Deine persönliche sequenz ist: ");
        printCustomSequence(n1,n2,iteration);

    }
}