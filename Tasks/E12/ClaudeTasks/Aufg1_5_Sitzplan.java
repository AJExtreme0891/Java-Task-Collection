package Tasks.E12.ClaudeTasks;
import Tasks.Classes.MicsClasses.Student;


public class Aufg1_5_Sitzplan {

    public static void main(String[] args) {
        Student Andre = new Student(17, "Andre-Justin", 15186814 );
        int[] seating = erstelleSitzplan();
        belegePlatz(seating, 5, Andre.id);
        System.out.println(istFrei(seating, 5));
    }

    public static int[] erstelleSitzplan() {
        int[] seating = new int[15];
        for (int i = 0; i < 15; i++) {
            seating[i] = i;
        }
        return seating;
    }

    public static void belegePlatz(int[] seating, int platz, int id) {
        seating[platz] = id;
    }

    public static boolean istFrei(int[] seating, int platz) {
        boolean state = false;
        if (seating[platz] == 0 ) {
            state = true;
        }
        return state;
    }

}

