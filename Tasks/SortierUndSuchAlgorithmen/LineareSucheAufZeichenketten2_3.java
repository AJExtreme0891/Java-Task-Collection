package Tasks.SortierAlgorithmen;

public class LineareSucheAufZeichenketten2_3 {

    int suche(String[] f, String gesucht){
        for (int i = 0; i < f.length; i++){
            if(f[i].equals(gesucht)){
                return i;
            }
        }
        return -1;
    }
    }


