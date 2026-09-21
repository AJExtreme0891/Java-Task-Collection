package Tasks.E12.BasicJava;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Temperatur {

    public static String convertToFahrenheit(double temperature) {
        double result = temperature * 1.8 + 32;
        NumberFormat n = NumberFormat.getNumberInstance(Locale.US);
        n.setMaximumFractionDigits(2);
        return n.format(result);
    }

    public static String convertToCelsius(double temperature){
        double result = (temperature - 32) / 1.8;
        NumberFormat n = NumberFormat.getNumberInstance(Locale.US);
        n.setMaximumFractionDigits(2);
        return n.format(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("State the temperature to convert");
            System.out.print(">");
            String temperature = sc.nextLine();


            double x = Double.parseDouble(temperature.replaceAll("[^0-9. ]", ""));
            String letters = temperature.replaceAll("[0-9. ]", "");

            switch (letters.toLowerCase()) {
                case "f", "fahrenheit":
                    System.out.println("It's " + convertToCelsius(x) + " Celsius");
                    break;
                case "c", "celsius":
                    System.out.println("It's " + convertToFahrenheit(x) + " Fahrenheit");
                    break;
                default:
                    System.out.println(letters + " is not a unit of temperature try it with Celsius or Fahrenheit");
                    continue;
            }
            System.out.println("\nDo you want to stop");
            String answer = sc.next();
            answer = answer.toLowerCase();
            if (answer.equals("yes")){
                break;
            }


        }









    }
            }
