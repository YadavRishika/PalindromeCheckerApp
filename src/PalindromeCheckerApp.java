public class PalindromeCheckerApp {

    public static void main(String[] args) {


        String input = "level";

        // Algorithm 1: Two-Pointer
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;


        // Algorithm 2: Reverse Method
        long start2 = System.nanoTime();
        boolean result2 = reverseCheck(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;


        System.out.println("Input : " + input);

        System.out.println("\nTwo-Pointer Method:");
        System.out.println("Is Palindrome? : " + result1);
        System.out.println("Execution Time : " + time1 + " ns");

        System.out.println("\nReverse Method:");
        System.out.println("Is Palindrome? : " + result2);
        System.out.println("Execution Time : " + time2 + " ns");
    }

    // Two-pointer algorithm
    public static boolean twoPointerCheck(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Reverse string algorithm
    public static boolean reverseCheck(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }
}