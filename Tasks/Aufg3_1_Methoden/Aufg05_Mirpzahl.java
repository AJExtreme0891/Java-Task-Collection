package Tasks.Aufg3_1_Methoden;

public class Aufg05_Mirpzahl {

    public static boolean isPrime(int i){
    if (i < 2) return false;

    for (int j = 2; j * j <= i; j++) {
        if(i % j == 0){
            return false;
        }
    }
    return true;
}
    public static int reverse(int number) {
        int reversed = 0;
        int sign = number < 0 ? -1 : 1; // Preserve sign
        number = Math.abs(number);

        while (number != 0) {
            int digit = number % 10; // Get last digit
            // Check for integer overflow before multiplying
            reversed = reversed * 10 + digit;
            number /= 10; // Remove last digit
        }

        return reversed * sign;
    }
    public static boolean isMirpNum(int i){
    int reversed = reverse(i);
    return isPrime(i) && isPrime(reversed) && i != reversed;
}

    public static void main(String[] args){
        for (int i = 0; i < 1000; i++) {
            if(isMirpNum(i)){
                System.out.print(i + ", ");
            }
        }
    }

}
