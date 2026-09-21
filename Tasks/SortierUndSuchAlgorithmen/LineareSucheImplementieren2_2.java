package Tasks.SortierAlgorithmen;

public class LineareSucheImplementieren2_2 {

    public int lineareSuche(int[] f, int gesucht){
        for (int i = 0; i < f.length; i++){
            if(f[i] == gesucht){
                return i;
            }
        }
        return -1;
    }
}
