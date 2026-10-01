package Tasks.SortierUndSuchAlgorithmen;


import java.util.Arrays;

public class Hashtable2_10 {
    static Integer[] hashtable = new Integer[11];

    public static void main(String[] args) {
        int[] numbers = {2024, 1432, 2973, 3300, 4408, 1653};
        for (int num : numbers) {
            addNumInHash(num);
        }
        System.out.println(Arrays.toString(hashtable));
    }

    public static int calcKey(int key) {
        return key % 11;
    }

    public static void addNumInHash(int num) {
        int index = calcKey(num);
        int hold = 0;
        while (hashtable[index] != null) {
            System.out.println("Collision");
            index = (index + 1) % 11;
            hold++;
            if (hold >= 17) {
                break;
            }
        }
        if (!(hold >= 17)) {
            hashtable[index] = num;
        }
    }

    public static int searchHash(int num) {
        int index = calcKey(num);

        while (hashtable[index] != null) {
            if (hashtable[index] == num) {
                return index;
            }

            index = (index + 1) % 11;
        }

        return -1;
    }
}
