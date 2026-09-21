package Tasks.SortierAlgorithmen;


public class Hashtable2_10 {
    static Integer[] hashtable = new Integer[11];

    public static void main(String[] args) {
        int[] numbers = {2024, 1432, 2973, 3300, 4408, 1653};
        for (int num : numbers){
            addNumInHash(num);
        }

    }

    public static int calcKey(int key) {
        return key % 11;
    }

    public static void addNumInHash(int num) {
        int index = calcKey(num);

        while (hashtable[index] != null) {
            if (index >= 11) {
                index = -1;
                break;
            }
            index = (index + 1);
            System.out.println("Collision");

        }
        if (index != -1) {
            hashtable[index] = num;
        }

    }

    public static int searchHash(int num) {
        int index = calcKey(num);
        while (hashtable[index] != 0) {
            if (hashtable[index] == num) {
                return index;
            } else {
                index += 1;
            }
        }
        return -1;
    }
}
