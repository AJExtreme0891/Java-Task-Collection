package Tasks.BasicJava;
import java.util.Scanner;
public class GetraenkeAutomat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie viele Colas willst du: ");
        int numcola = sc.nextInt();
        System.out.println("Wie viel Wasser willst du: ");
        int numwater = sc.nextInt();
        
        double price = numwater*1 + numcola*1.50;
        System.out.println("Your price is "+price);
        double payment = sc.nextDouble();
        String answer = "Thank you for you purchase";
        
        if(payment < price){
            while(true){
                if (price >= payment){
                    break;
                }else {
                price -= payment;
                    System.out.println("You still have to play: " + price);
                    
                }
            }
        }
        
        if(payment > price){
            payment -= price;
            
            int twos = (int)payment / 2;
            int twoschange = (int)payment % 2;
            int ones = twoschange / 1;
            int oneschange = twoschange % 1;
            
            System.out.println("Your change is 2: " + twos + " 1: " + ones + " change: " + oneschange);
            
        }
        
    }
    
}