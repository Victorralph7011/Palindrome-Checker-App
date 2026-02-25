import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 12.0");

        String input = "level";

        // Injecting a specific strategy at runtime
        PalindromeContext context = new PalindromeContext(new StackStrategy());
        boolean result = context.executeStrategy(input);

        System.out.println("\nInput : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

// 1. Define the Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// 2. Implement a Concrete Strategy (Stack Based)
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// 3. Context Class to use the Strategy
class PalindromeContext {
    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.check(input);
    }
}