package Classes;

import Classes.MicsClasses.Schueler;


import java.util.ArrayList;

public class Kurs1_11 {
    private static ArrayList<Schueler> studentList = new ArrayList<Schueler>();

    static void main(String[] args){

        studentList.add(new Schueler("Maximilian Müller", "10A", 16));
        studentList.add(new Schueler("Emma Schmidt", "5B", 11));
        studentList.add(new Schueler("Ben Fischer", "12C", 18));
        studentList.add(new Schueler("Hannah Weber", "8A", 14));
        studentList.add(new Schueler("Jonas Meyer", "6B", 12));
        studentList.add(new Schueler("Mia Wagner", "11A", 17));
        studentList.add(new Schueler("Leon Becker", "9C", 15));
        studentList.add(new Schueler("Lina Schulz", "7B", 13));
        studentList.add(new Schueler("Noah Hoffmann", "10B", 16));
        studentList.add(new Schueler("Marie Koch", "5A", 10));
        studentList.add(new Schueler("Felix Bauer", "12A", 18));
        studentList.add(new Schueler("Sophia Richter", "8B", 14));
        studentList.add(new Schueler("Elias Klein", "6A", 11));
        studentList.add(new Schueler("Emilia Wolf", "11B", 17));
        studentList.add(new Schueler("Lukas Schröder", "9A", 15));


        System.out.println(averageAge());


    }

    public static void addStudent(String name, int age, String klasse) {
        studentList.add(new Schueler(name, klasse, age));
    }

    public static int teilnehmerZahl(){
        return studentList.size();
    }

    public static int averageAge(){
        int hold = 0;
        for (int i = 0; i < studentList.size(); i++) {
            hold += studentList.get(i).getAlter();
        }
        return hold / studentList.size();
    }
}
