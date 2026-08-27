package Tasks.ClaudeTasks;

public class Kapitel3_Zeichenketten {
    
    public static String normalisieren(String s){
        return s.toLowerCase().replaceAll(" ", "");
    }
    public static int anzahlZeichen(String s, char gesucht){
        int hold = 0;
        int length = s.length();

        for(int i = 0; i < length;i++){
            char x = s.charAt(i);
            if (x == gesucht) {
                hold++;
            }
        }

        return hold;
    }
    
}