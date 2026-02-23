package app.src;

import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] var0) {
      Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a word to check: ");
        String word = scanner.nextLine();

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("-----------------------------------------");
        System.out.println("Application execution completed.");

        // Close scanner
        scanner.close();
   }
    

}
