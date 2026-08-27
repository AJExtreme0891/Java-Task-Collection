package Tasks.BasicJava;

import java.text.NumberFormat;


import java.util.Locale;
import java.util.Scanner;

public class BMIRechner {


    public static double convertLbToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertStToKg(double stone) {
        return stone * 6.35029;
    }

    public static double convertGToKg(double gram) {
        return gram / 1000;
    }

    public static double convertCmToM(double centimeter) {
        return centimeter / 100;
    }

    public static double convertFtToM(double feet) {
        return feet * 0.3048;
    }

    public static double convertInToM(double inch) {
        return inch * 0.0254;
    }

    public static Double calcBMI(double height, double weight) {
        return weight / (height * height);
    }


    public static void main(String[] args) {
        NumberFormat n = NumberFormat.getNumberInstance(Locale.US);
        n.setMaximumFractionDigits(2);
        Scanner scanner = new Scanner(System.in);


        while (true) {
            double weightInKg = 0, heightInM = 0, BMI;
            boolean gaveCorrectUnits = true;

            System.out.println("Was wiegst du: ");
            String weight = scanner.next();


            double digitsWeight = Double.parseDouble(weight.replaceAll("[^0-9. ]", ""));
            String lettersWeight = weight.replaceAll("[0-9. ]", "");


            switch (lettersWeight.toLowerCase()) {
                case "lb", "pounds":
                    weightInKg = convertLbToKg(digitsWeight);
                    break;
                case "kg", "kilo", "kilogram":
                    weightInKg = digitsWeight;
                    System.out.println(weightInKg);
                    break;
                case "st", "stone":
                    weightInKg = convertStToKg(digitsWeight);
                    break;
                case "g", "gram":
                    weightInKg = convertGToKg(digitsWeight);
                    break;
                default:
                    System.out.println(lettersWeight + " is not a unit of Mass try it with lb or kg");
                    gaveCorrectUnits = false;
                    break;
            }
            if (gaveCorrectUnits) {
                System.out.println("Wie groß bist du: ");
                String height = scanner.next();


                double digitsHeight = Double.parseDouble(height.replaceAll("[^0-9. ]", ""));
                String lettersHeight = height.replaceAll("[0-9. ]", "");

                switch (lettersHeight.toLowerCase()) {
                    case "m", "meter":
                        heightInM = digitsHeight;
                        System.out.println(height + " " + heightInM);
                        break;
                    case "cm", "centimeters":
                        heightInM = convertCmToM(digitsHeight);
                        break;
                    case "ft", "feet":
                        heightInM = convertFtToM(digitsHeight);
                        break;
                    case "in", "inches":
                        heightInM = convertInToM(digitsHeight);
                        break;
                    default:
                        System.out.println(lettersHeight + " is not a unit of Height try it with m, cm, ft or in.");
                        gaveCorrectUnits = false;
                        break;
                }


                String kategory;
                if (gaveCorrectUnits) {

                    System.out.println("What is your Gender: ");
                    String gender = scanner.next();
                    gender = gender.toLowerCase();
                    BMI = calcBMI(heightInM, weightInKg);
                    kategory = "undefined";

                    if (gender.equals("female")) {
                        if (BMI < 15) {
                            kategory = "Sehr starkes Untergewicht";
                        } else if (BMI >= 15 && BMI <= 15.9) {
                            kategory = "Untergewicht";
                        } else if (BMI >= 16 && BMI <= 17.4) {
                            kategory = "Leichtes Untergewicht";
                        } else if (BMI >= 17.5 && BMI <= 23.9) {
                            kategory = "Normalgewicht";
                        } else if (BMI >= 24 && BMI <= 28.9) {
                            kategory = "Leichtes Übergewicht";
                        } else if (BMI >= 29 && BMI <= 33.9) {
                            kategory = "Übergewicht";
                        } else if (BMI >= 34 && BMI <= 38.9) {
                            kategory = "Starkes Übergewicht";
                        } else if (BMI >= 39) {
                            kategory = "Sehr starkes Übergewicht";
                        }


                    } else if (gender.equals("male")) {
                        if (BMI < 16) {
                            kategory = "Sehr starkes Untergewicht";
                        } else if (BMI >= 16 && BMI <= 16.9) {
                            kategory = "Untergewicht";
                        } else if (BMI >= 17 && BMI <= 18.4) {
                            kategory = "Leichtes Untergewicht";
                        } else if (BMI >= 18.5 && BMI <= 24.9) {
                            kategory = "Normalgewicht";
                        } else if (BMI >= 25 && BMI <= 29.9) {
                            kategory = "Leichtes Übergewicht";
                        } else if (BMI >= 30 && BMI <= 34.9) {
                            kategory = "Übergewicht";
                        } else if (BMI >= 35 && BMI <= 39.9) {
                            kategory = "Starkes Übergewicht";
                        } else if (BMI >= 40) {
                            kategory = "Sehr starkes Übergewicht";
                        }

                    } else {
                        System.out.println("We are only taking male and female nothing else");
                        continue;
                    }
                } else continue;


                System.out.println("Mit einem BMI von " + n.format(BMI) + " bist du in der Kategorie: " + kategory);
                System.out.println("Do you want to stop");
                String again = scanner.next();
                again = again.toLowerCase();
                if (again.equals("ja") || again.equals("yes")) {
                    break;
                }


            }
        }
    }


}


