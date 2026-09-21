package Tasks.SortierAlgorithmen;

public class BinarySearch {
    private static int[] field = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    private static String[] fieldString = {"a","b","c","d","e","f","g","h","i","j"};


    static void main(String[] args) {
        System.out.println(binarySearchNum(5));
        System.out.println(binarySearchString("d"));
    }


    public static int binarySearchNum(int gesucht) {
        int links = 0;
        int rechts = field.length-1;
        int mitte = 0;

        while(links <= rechts){
            mitte = (links + rechts) / 2;
            if (field[mitte] == gesucht){
                return mitte;
            }else if (field[mitte] < gesucht){
                links = mitte + 1;
            }else
                rechts = mitte -1;
        }

        return -1;

    }

    public static int binarySearchString(String gesucht){
        int links = 0;
        int rechts = fieldString.length-1;
        int mitte = 0;

        while(links <= rechts){
            mitte = (links + rechts) / 2;
            if (fieldString[mitte].compareTo(gesucht) == 0){
                return mitte;
            }else if (fieldString[mitte].compareTo(gesucht) < 0){
                links = mitte + 1;
            }else
                rechts = mitte -1;
        }

        return -1;
    }

}
