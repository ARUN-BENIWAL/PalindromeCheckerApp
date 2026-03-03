public class PalindromeCheckerApp {

    // Public method (exposed behavior)
    public boolean checkPalindrome(String input) {

        if (input == null)
            return false;

        String normalized = normalize(input);

        return isPalindrome(normalized);
    }

    // Private helper method (encapsulation)
    private String normalize(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();
    }

    // Internal palindrome logic (Two-pointer approach)
    private boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}