package Tasks.Aufg3_1_Methoden;

public class Aufg04_VollkommeneZahlen {


        public static void main(String[] args){

            System.out.println("Vollkommene Zahlen bis 10.000:");

            for (int i = 1; i <= 10000; i++) {
                if (istVollkommeneZahl(i)) {
                    System.out.println(i);
                }
            }

        }

        public static int summeTeiler(int Zahl){

            int sum = 0;
            for (int i = 1; i < Zahl; i++) {
                if (Zahl % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }

        public static boolean istVollkommeneZahl(int Zahl) {

            int summeDerTeiler = summeTeiler(Zahl);
            return summeDerTeiler == Zahl;
        }
    }

