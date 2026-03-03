import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Normalize string
        String normalized = input
                .replaceAll("\\s+", "")   // remove spaces
                .toLowerCase();           // convert to lowercase

        // Step 2: Apply two-pointer logic
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Display result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();
    }
}