public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 11.0");

        PalindromeService service = new PalindromeService();
        String input = "racecar";
        boolean result = service.checkPalindrome(input);

        System.out.println("\nInput : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

class PalindromeService {
    public boolean checkPalindrome(String input) {
        if (input == null) {
            return false;
        }

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
}