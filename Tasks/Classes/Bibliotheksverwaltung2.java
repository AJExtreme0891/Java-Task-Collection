package Tasks.Classes;

import Tasks.Classes.MicsClasses.Book;

public class Bibliotheksverwaltung2 {
    public static Book[] regal = {
            // J.R.R. Tolkien (3 Bücher)
            new Book("The Hobbit", "J.R.R. Tolkien"),
            new Book("The Fellowship of the Ring", "J.R.R. Tolkien"),
            new Book("The Two Towers", "J.R.R. Tolkien"),

            // J.K. Rowling (3 Bücher)
            new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
            new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling"),
            new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling"),

            // George Orwell (2 Bücher)
            new Book("1984", "George Orwell"),
            new Book("Animal Farm", "George Orwell"),

            // Stephen King (3 Bücher)
            new Book("The Shining", "Stephen King"),
            new Book("It", "Stephen King"),
            new Book("Misery", "Stephen King"),

            // Agatha Christie (2 Bücher)
            new Book("Murder on the Orient Express", "Agatha Christie"),
            new Book("And Then There Were None", "Agatha Christie"),

            // Einzelne Autoren zum Testen
            new Book("To Kill a Mockingbird", "Harper Lee"),
            new Book("The Great Gatsby", "F. Scott Fitzgerald")
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
