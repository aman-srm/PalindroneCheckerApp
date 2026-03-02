package app.src;

import java.util.Scanner;

public class PalindromeCheckerApp{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }

    // Recursive method
    public static boolean isPalindrome(String str, int left, int right) {

        // Base Condition
        if (left >= right) {
            return true;
        }

        // If mismatch found
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive Call (move inward)
        return isPalindrome(str, left + 1, right - 1);
    }
}