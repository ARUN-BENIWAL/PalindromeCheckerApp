

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "racecar";

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy reverseStrategy = new ReverseStrategy();

        // Measure Stack Strategy
        long startTime = System.nanoTime();
        boolean stackResult = stackStrategy.isPalindrome(text);
        long endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Measure Reverse Strategy
        startTime = System.nanoTime();
        boolean reverseResult = reverseStrategy.isPalindrome(text);
        endTime = System.nanoTime();
        long reverseTime = endTime - startTime;

        // Display Results
        System.out.println("Input String: " + text);
        System.out.println();

        System.out.println("Stack Strategy Result: " + stackResult);
        System.out.println("Execution Time: " + stackTime + " ns");
        System.out.println();

        System.out.println("Reverse Strategy Result: " + reverseResult);
        System.out.println("Execution Time: " + reverseTime + " ns");
    }
}


interface PalindromeStrategy {
    boolean isPalindrome(String text);
}


class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String text) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

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



class ReverseStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String text) {

        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
}