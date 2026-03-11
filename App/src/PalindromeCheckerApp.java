import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // Inject strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.isPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}



interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String text) {

        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return text.equals(reversed);
    }
}