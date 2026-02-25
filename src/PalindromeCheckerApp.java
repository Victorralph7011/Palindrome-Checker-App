/**
 * UC2: Print a Hardcoded Palindrome Result
 * Goal: Display whether a hardcoded string is a palindrome.
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");

        // UC2: Hardcoded String Logic
        String input = "madam"; // Hardcoded string literal
        String reversed = "";

        // Core programming logic to reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("\n--- UC2: Hardcoded Check ---");
        System.out.println("Input String: " + input);

        // Conditional Statement (if-else) to validate palindrome
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a PALINDROME.");
        }
    }
}