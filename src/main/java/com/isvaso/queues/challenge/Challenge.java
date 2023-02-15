package com.isvaso.queues.challenge;

import java.util.LinkedList;

/**
 * Queues Challenge - Challenge
 * <br>
 * <ul>
 *     <li>Using a stack and a queue, determine whether a string
 *     is a palindrome</li>
 *     <li>String s my contain punctuation and spaces.
 *     The should be ignored. Case should be ignored.</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class Challenge {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        String lowString = string.toLowerCase();
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        char character;

        for (int i = 0; i < lowString.length(); i++) {
            character = lowString.charAt(i);
            if (character >= 'a' && character <= 'z') {
                stack.push(character);
                queue.add(character);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.pop()))
                return false;
        }

        return true;
    }
}
