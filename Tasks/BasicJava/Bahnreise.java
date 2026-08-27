package Tasks.BasicJava;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;



public class Bahnreise{
public static void main(String[] args){
double normalPrice;
int people;
Scanner sc = new Scanner(System.in);
NumberFormat n = NumberFormat.getNumberInstance(Locale.US);
n.setMaximumFractionDigits(2);

System.out.println("Wie viel kostet deine Reise pro Person: ");
normalPrice = sc.nextDouble();

System.out.println("\nWie viele Personen kommen");
people = sc.nextInt();




if (people >= 6){
normalPrice *= 0.3;

}
double result = people * normalPrice;



}


}