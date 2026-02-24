import java.util.*;
public class PalindromeCheckerApp {
    public static void main (String args[]){
        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        String input = "";
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string");
        input=in.nextLine();
        boolean isPalindrome = true;

        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}