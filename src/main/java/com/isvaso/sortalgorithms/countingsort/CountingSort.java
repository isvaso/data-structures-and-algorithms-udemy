package com.isvaso.sortalgorithms.countingsort;
/**
 * Counting Sort<br>
 * <ul>
 *     <li>Makes assumptions about the data</li>
 *     <li>Doesn't use comparisons</li>
 *     <li>Count the number of occurrences of each value</li>
 *     <li>Only works with non-negative discrete values
 *     (can't work with floats, strings</li>
 *     <li>Values must be within a specific range</li>
 *     <li>NOT an in-place algorithm</li>
 *     <li>O(n) - can achieve this because we're making assumption
 *     about the data we're sorting</li>
 *     <li>If we want the sort to be stable, we have to do some extra steps</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class CountingSort {

    public static void sort(int[] input, int min, int max) {
        int[] countArray = new int[(max) - (min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;

        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
