package Tasks.Aufg3_2_2_Schleifen;

public class Aufg23_Fakultät {
    public static long fakaulty(int x){
        long facaulty = 1;
        for (int i = x; i > 0; i--) {

            facaulty *= (i);

        }
        return facaulty;
    }
    public static void main(String[] args){
        System.out.println(fakaulty(5));;
    }
}
