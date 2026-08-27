package Tasks.ArrayAufgaben;



public class Array2Aufg2_ZehnGanzeZahlen {
    public static void main(String[] args){
        
        int[] ganzZahlen = new int[10];
        
        for(int i = 0; i < ganzZahlen.length; i++){
            ganzZahlen[i] = i+1;
        }
        
        System.out.println("Array before: ");
        
        for(int i = 0; i <ganzZahlen.length; i++){
            System.out.print(ganzZahlen[i] + ", ");
        }
        
        System.out.println("\n\nArray after: ");
        
        for(int i = (ganzZahlen.length-1); i >= 0; i--){
            System.out.print(ganzZahlen[i]*ganzZahlen[i] + ", ");
        }
        
        
    }
}