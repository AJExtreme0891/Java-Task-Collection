package Tasks.ArrayAufgaben;

public class Array3Aufg1_500_doubles {
    static void main(String[] args){
        double[] kurse = new double[501];

        for(int i = 0; i < kurse.length;i++){
            kurse[i] = 500 - i;
        }
    }
}
