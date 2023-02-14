package com.isvaso.sortalgorithms.challenge3;
/**
 * Sort Algorithms - Challenge #3
 * <br>
 * <ul>
 *     <li>Sort the following values using radix sort:
 *     "bcdef", "dbaqc", "abcde", "omadd", bbbbb"</li>
 *     <li>All values are in lowercase, so don't worry about
 *     uppercase//lowercase the values</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class Challenge3 {
    /**
     * Radix Sort implementation method
     * @param input source {@code int} array
     * @param radix radix (for {@code String} is 26)
     * @param width width of numbers in source array
     */
    public static void sort(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--)
            radixSingleSort(input, i, radix);
    }
    /**
     * Single {@code char} sorting method
     * @param input source {@code String} array
     * @param position position of a {@code char} in a {@code String}
     * @param radix radix (for lower {@code String} is 26)
     */
    private static void radixSingleSort(String[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value : input) {
            countArray[getChar(position, value)]++;
        }

        for (int j = 1; j < radix; j++)
            countArray[j] += countArray[j - 1];

        String[] temp = new String[numItems];

        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--)
            temp[--countArray[getChar(position, input[tempIndex])]] =
                    input[tempIndex];

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++)
            input[tempIndex] = temp[tempIndex];
    }
    /**
     * Method for getting a {@code int} ASCII of {@code char}
     * from a {@code String} by position
     * @param position position of a {@code char} in a {@code String}
     * @param value value from array
     * @return {@code int} Unicode of {@code char}
     */
    private static int getChar(int position, String value) {
        return value.charAt(position) - 'a';
    }
}
