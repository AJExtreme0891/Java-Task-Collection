package Tasks.E12.BasicJava;
import java.util.Scanner;

public class Bleistifte {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie Stifte willst du verpacken: ");
        int numPencils = sc.nextInt();

        int hull = numPencils / 4;
        int losepencils = numPencils % 4;

        int packets = hull / 6;
        int losehulls = hull % 6;

        int packages = packets / 8;
        int losepackets = packets % 8;

        System.out.println("Anzahl voller Kartons: " + packages);
        System.out.println("Anzahl voller Schachteln: " + packets + ", lose: " + losehulls );
        System.out.println("Anzahl voller Hüllen: " + hull + ", lose: " + losepackets);
        System.out.println("Anzahl an verpackter Stifte: " + (numPencils - losepencils) + ", lose: " + losepencils);
    }
}
