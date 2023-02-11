package com.isvaso.sortalgorithms.radixsort;
/**
 * Radix Sort<br>
 * <ul>
 *     <li>Makes assumptions about the data</li>
 *     <li>Data must have same radix and width</li>
 *     <li>Because of this, data must be integers or strings</li>
 *     <li>Sort based on each individual digit or letter position</li>
 *     <li>Start at the rightmost position</li>
 *     <li>Must use a stable sort algorithm at each stage</li>
 *     <li>Counting sort is often used as the sort algorithm for radix sort -
 *     must be stable counting sort</li>
 *     <li>O(n) - can achieve, this because we're making assumptions
 *     about the data we're sorting</li>
 *     <li>Even so, if often runs slower than O(n log n) algorithms
 *     because of the overhead involved</li>
 *     <li>In-place depends on which sort algorithm you use</li>
 *     <li>Stable algorithm</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class RadixSort {
    /**
     * Radix Sort implementation method
     * @param input source {@code int} array
     * @param radix radix (for {@code int} is 10)
     * @param width width of numbers in source array (1462 = 4)
     */
    public static void sort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++)
            radixSingleSort(input, i, radix);
    }
    /**
     * Single digit sorting method
     * @param input source {@code int} array
     * @param position position of a digit in a number
     * @param radix radix (for {@code int} is 10)
     */
    private static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }

        // Adjust the count array
        // Make a shift, which allows us to understand the number of elements
        for (int j = 1; j < radix; j++)
            countArray[j] += countArray[j - 1];

        // 1010000100 -> 112222233
        // there are 3 elements, so we will know
        // the new positions in the array temp[]
        // --3 = 2, --1 = 0 etc.

        int[] temp = new int[numItems];

        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--)
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] =
                    input[tempIndex];

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++)
            input[tempIndex] = temp[tempIndex];
    }
    /**
     * Method for getting a digit from a number by position
     * @param position position of a digit in a number
     * @param value value from array
     * @param radix radix (for {@code int} is 10)
     * @return {@code int} digit from a number by position
     */
    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(10, position) % radix;
    }
}
