package app.src;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Reverse String Algorithm
        long start1 = System.nanoTime();
        boolean reverseResult = reverseMethod(input);
        long end1 = System.nanoTime();

        // Stack Algorithm
        long start2 = System.nanoTime();
        boolean stackResult = stackMethod(input);
        long end2 = System.nanoTime();

        // Deque Algorithm
        long start3 = System.nanoTime();
        boolean dequeResult = dequeMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Reverse Method: " + reverseResult +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + stackResult +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Method: " + dequeResult +
                " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }

    // Reverse String Algorithm
    public static boolean reverseMethod(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equals(reversed);
    }

    // Stack Algorithm
    public static boolean stackMethod(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque Algorithm
    public static boolean dequeMethod(String str) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}