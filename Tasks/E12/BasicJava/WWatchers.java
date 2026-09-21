package Tasks.E12.BasicJava;
import java.util.Scanner;
public class WWatchers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Was ist der Brennwert in g: ");
        double burnRate = sc.nextDouble();
        System.out.println("Was ist der Fettgehalt in g pro 100g: ");
        double amountFat = sc.nextDouble();
        System.out.println("Was ist das Gesamtgewicht in g: ");
        double weight = sc.nextDouble();
        
        double points = Math.round(((burnRate/60)+(amountFat/9))*(weight/100)*2)/2.0;
        System.out.println("Das ist dein Punktewert: "+points);
        
        
    }
    
}