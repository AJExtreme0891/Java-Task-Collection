package Classes;

import Classes.MicsClasses.Books;

public class Bibliotheksverwaltung2 {
    public static Books[] regal = {
            // J.R.R. Tolkien (3 Bücher)
            new Books("The Hobbit", "J.R.R. Tolkien"),
            new Books("The Fellowship of the Ring", "J.R.R. Tolkien"),
            new Books("The Two Towers", "J.R.R. Tolkien"),

            // J.K. Rowling (3 Bücher)
            new Books("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
            new Books("Harry Potter and the Chamber of Secrets", "J.K. Rowling"),
            new Books("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling"),

            // George Orwell (2 Bücher)
            new Books("1984", "George Orwell"),
            new Books("Animal Farm", "George Orwell"),

            // Stephen King (3 Bücher)
            new Books("The Shining", "Stephen King"),
            new Books("It", "Stephen King"),
            new Books("Misery", "Stephen King"),

            // Agatha Christie (2 Bücher)
            new Books("Murder on the Orient Express", "Agatha Christie"),
            new Books("And Then There Were None", "Agatha Christie"),

            // Einzelne Autoren zum Testen
            new Books("To Kill a Mockingbird", "Harper Lee"),
            new Books("The Great Gatsby", "F. Scott Fitzgerald")
    };

    public static void main(String[] args) {


        System.out.println(anzahlVon("J.R.R. Tolkien"));

        String title = suche("It");
        System.out.println(title);
        title = suche("Them");
        System.out.println(title);

    }


    public static int anzahlVon(String author) {
        int result = 0;
        for (int i = 0; i < regal.length; i++) {
            if (regal[i].getAuthor().equals(author)) {
                result++;
            }
        }
        return result;
    }

    public static String suche(String title){
        for (int i = 0; i < regal.length; i++) {
            if(regal[i].getTitle().equals(title)){
                return regal[i].getTitle();
            }
        }
        return null;
    }
}
