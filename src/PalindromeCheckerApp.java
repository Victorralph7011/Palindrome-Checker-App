public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 13.0");

        String input = "level";

        // Capture execution start time in nanoseconds
        long startTime = System.nanoTime();

        // Execution of the validation logic (Using a simple loop for benchmarking)
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Capture execution end time
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long duration = endTime - startTime;

        System.out.println("\nInput : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}