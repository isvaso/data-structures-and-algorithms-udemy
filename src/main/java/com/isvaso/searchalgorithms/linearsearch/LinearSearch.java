package com.isvaso.searchalgorithms.linearsearch;

/**
 * Counting Sort<br>
 * <ul>
 *     <li>Searches through all items up to the desired element</li>
 *     <li>Data may not be sorted</li>
 *     <li>Finding an element in linear time O(n)</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class LinearSearch {
    /**
     * Linear Search implementation method
     * @param input {@code int} source array
     * @param value {@code int} desired value
     * @return {@code int} index of desired value in source array
     * or {@code int} -1 if not found
     */
    public static int search(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value)
                return i;
        }
        return -1;
    }
}
