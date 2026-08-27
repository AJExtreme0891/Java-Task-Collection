package Tasks.Aufg3_2_Felder_Arrays;

public class Aufg16_Lichterkette {
    public static void main(String[] args) {

        boolean[] bulbs = new boolean[101];

        for (int guest = 1; guest <= 100; guest++) {

            for (int bulb = guest; bulb <= 100; bulb += guest) {
                bulbs[bulb] = !bulbs[bulb];
            }
        }
        System.out.println("Leuchtende Glühbirnen:");
        for (int i = 1; i <= 100; i++) {
            if (bulbs[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

