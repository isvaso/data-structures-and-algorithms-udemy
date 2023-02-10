package com.isvaso.sortalgorithms.mergesort;
/**
 * Merge Sort<br>
 * <ol>
 *     <li>NOT an in-place algorithm</li>
 *     <li>O(n log n) - base 2. We're repeatedly dividing the array
 *     in half during the splitting phase</li>
 *     <li>Stable sort</li>
 * </ol>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class MergeSort {
    /**
     * Merge Sort implementation method
     *
     * @param input - source array
     * @param start - start position in the array
     * @param end   - middle position in the array increased by 1
     *              (like array size)
     */
    public static void sort(int[] input, int start, int end) {
        if (end - start < 2)
            return;

        int mid = (start + end) / 2;

        sort(input, start, mid);
        sort(input, mid, end);

        merge(input, start, mid, end);
    }

    /**
     * Method of merge two array ranges into one sorted one.
     *
     * @param input - source array
     * @param start - start position in the array
     * @param mid   - middle position in the array
     * @param end   - middle position in the array increased by 1
     *              (like array size)
     */
    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i,
                input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}


