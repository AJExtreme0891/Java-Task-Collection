package Tasks.Recursion;

import Tasks.E12.IntermediateJavaWithLoops.CalcFibonacci;
import Tasks.E12.IntermediateJavaWithLoops.CalcFibonacci.*;

public class RecursionSimple {
    public static void main(String[] args) {
        System.out.println(fakultaet(9));
        System.out.println(summeRecursion(4));
        System.out.println(summeIteration(4));
        System.out.println(potenz(2,5));
        System.out.println(fibonacciRecursion(5));
        System.out.println(CalcFibonacci.fib(5));
        System.out.println(g(48, 18));
        System.out.println(anzahl("Annoyance", 'n'));

    }

    public static int fakultaet(int fac){
        if (fac <= 1){ //anker
            return 1;
        }
        return fac * fakultaet(fac-1); //schritt
    }

    public static int summeRecursion(int n){
        if(n <= 1){ //schritt
            return 1;
        }
        return n + summeRecursion(n - 1); //schritt
    }

    public static int potenz(int basis, int exponent){
        if (exponent <= 1){
            return basis;
        }
        return basis * potenz(basis, exponent-1);
    }

    public static int summeIteration(int n){
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result + n-i;
        }
        return result;
    }

    public static int fibonacciRecursion(int f){
        if (f <=2){
            return 1;
        }
        return fibonacciRecursion(f-1) + fibonacciRecursion(f-2);
    }
// 1, 1, 2, 3, 5, 8,
    public static int g(int a, int b){
        if (b == 0){
            return a;
        }
        return g(b, a%b);
        //18, 48%18 -> g(18,12) //12, 18%12 -> g(12, 6)//6 , 12%6 -> g(6,0)// b=0 also return 6
    }


    public static int anzahl(String s, char c){
        if (s.isEmpty()){
            return 0;
        }
        if(s.charAt(0) == c){
           return 1 + anzahl(s.substring(1), c);
        }

       return anzahl(s.substring(1), c);
    }
    

}
