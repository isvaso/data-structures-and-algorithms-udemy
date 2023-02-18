package com.isvaso.searchalgorithms.binarysearch;

/**
 * Binary Sort<br>
 * <ul>
 *     <li>Data must vbe sorted!</li>
 *     <li><Chooses the element in the middle of the array
 *     and compares it against the search value/li>
 *     <li>If elements is equal to the value, we're done</li>
 *     <li>If element is greater than the value,
 *     search the left half of the array</li>
 *     <li>If element is less than value,
 *     search the right half of the array</li>
 *     <li>Time complexity is O(log n)</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class BinarySearch {

    /**
     * Binary Search iterative implementation method
     * @param input {@code int} source array
     * @param value {@code int} desired value
     * @return {@code int} index of desired value in source array
     * or {@code int} -1 if not found
     */
    public static int iterativeSearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while(start < end) {
            int midpoint = (start + end) / 2;

            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }

    /**
     * Binary Search recursive implementation method
     * @param input {@code int} source array
     * @param value {@code int} desired value
     * @return {@code int} index of desired value in source array
     * or {@code int} -1 if not found
     */
    public static int recursiveSearch(int[] input, int value) {
        return recursiveSubSearch(input, 0, input.length, value);
    }

    /**
     * Submethod for recursive Binary Search implementation.
     * Method implements recursive Binary Search, but uses more parameters
     * for his realization
     * @param input {@code int} source array
     * @param start {@code int} of search range index in source array
     * @param end {@code int} of search range index in source array
     * @param value {@code int} desired value
     * @return {@code int} index of desired value in source array
     * or {@code int} -1 if not found
     */
    private static int recursiveSubSearch(int[] input, int start,
                                       int end, int value) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;

        if (input[midpoint] == value) {
            return midpoint;
        } else if (input[midpoint] < value) {
            return recursiveSubSearch(input, midpoint + 1, end, value);
        } else {
            return recursiveSubSearch(input, start, midpoint, value);
        }
    }
}
