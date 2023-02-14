package com.isvaso.stacks.challenge;

import java.util.LinkedList;

/**
 * Stack Challenge - Challenge
 * <br>
 * <ul>
 *     <li>Using a stack, determine whether a string is a palindrome</li>
 *     <li>String s my contain punctuation and spaces. The should be ignored.
 *     Case should be ignored.</li>
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
        StringBuilder stringBuilder = new StringBuilder(string.length());
        String lowString = string.toLowerCase();
        LinkedList<Character> stack = new LinkedList<>();

        char character;

        for (int i = 0; i < lowString.length(); i++) {
            character = lowString.charAt(i);
            if (character >= 'a' && character <= 'z') {
                stringBuilder.append(character);
                stack.push(character);
            }
        }

        StringBuilder reversedStringBuilder = new StringBuilder(stack.size());

        while (!stack.isEmpty())
            reversedStringBuilder.append(stack.pop());

        return reversedStringBuilder.toString().
                equals(stringBuilder.toString());
    }
}
