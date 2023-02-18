package com.isvaso.hashtables.challenge1;

/**
 * Hashtables - Challenge #1
 * <br><br>
 * Implement the hash() method to add elements to the nums array
 * <br><br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy
 */
public class Main {

    public static void main(String[] args) {

        int[] nums = new int[10];
        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
        for (int i = 0; i < numsToAdd.length; i++) {
            nums[hash(numsToAdd[i])] = numsToAdd[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
