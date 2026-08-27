package Tasks.E2ExamStudies;
import java.util.Scanner;
public class selfStudyNotenprogramm {
    public static void main(String[] args) {
//        Notenprogramm
//        Benutzer gibt Punkte (0–15) ein.
//                Ausgabe:
//        13–15 → sehr gut
//        10–12 → gut
//        7–9 → befriedigend
//        4–6 → ausreichend
//        1–3 → mangelhaft
//        0 → ungenügend
//        Falls Zahl außerhalb 0–15:
//→ Fehlermeldung

        Scanner sc = new Scanner(System.in);
        int grade = 0;
        String kategory = "undefined";

        System.out.println("Was ist deine Note (0-15)");
        grade = sc.nextInt();


        if (grade == 0) {
            kategory = "ungenügend";
        } else if (grade >= 1 && grade <= 3) {
            kategory = "mangelhaft";
        } else if (grade >= 4 && grade <= 6) {
            kategory = "ausreichend";
        } else if (grade >= 7 && grade <= 9) {
            kategory = "befriedigend";
        } else if (grade >= 10 && grade <= 12) {
            kategory = "gut";
        } else if (grade >= 13 && grade <= 15) {
            kategory = "sehr gut";
        } else {
            System.out.println("Dieses Programm benutzt das Notensystem von 0 bis 15 gebe etwas in diesem Intervall ein");
        }
        System.out.println("Deine Note ist: " + kategory);
    }
}
