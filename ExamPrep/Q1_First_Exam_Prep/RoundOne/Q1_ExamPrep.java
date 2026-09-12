package ExamPrep.Q1_First_Exam_Prep.RoundOne;

import Tasks.Classes.MicsClasses.Book;

public class Q1_ExamPrep {


    public static void main(String[] args) {
        int[][] feld = {
                {3,8,2},
                {7,1,9},
                {4,6,5}
        };


        System.out.println(sum(feld));
        System.out.println(groessteZahl(feld));
        System.out.println(zeilenSumme(feld,2));

    }

    public static int sum(int[][] feld){
        int sum = 0;
        for (int[] ints : feld) {
            for (int j = 0; j < feld[0].length; j++) {
                sum += ints[j];
            }
        }
        return sum;
    }

    public static int groessteZahl(int[][] feld){
        int hold = feld[0][0];
        for (int[] ints : feld) {
            for (int j = 0; j < feld[0].length; j++) {
                if (ints[j] > hold) {
                    hold = ints[j];
                }
            }
        }
        return hold;
    }

    public static int zeilenSumme(int[][] feld, int zeile){
        int hold = 0;
        for (int i = 0; i < feld[0].length; i++) {
            hold += feld[zeile][i];
        }
        return hold;
    }


















    public static void BookProblem(String[] args) {
        Book[] regal = new Book[5];

        regal[0] = new Book("Harry Potter", "J. K. Rowling");
        regal[1] = null;
        regal[2] = new Book("Momo", "Michael Ende");
        regal[3] = new Book("Krabat", "Otfried Preußler");
        regal[4] = null;

        System.out.println(anzahlVon(regal, "J. K. Rowling"));

    }

    public static int anzahlVon(Book[] regal, String author) {
        int finds = 0;
        for (Book book : regal) {
            if (book != null) {
                if (book.getAuthor().equals(author)) {
                    finds++;
                }
            }
        }
        return finds;
    }

}
