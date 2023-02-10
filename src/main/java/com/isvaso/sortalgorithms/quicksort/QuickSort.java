package com.isvaso.sortalgorithms.quicksort;
/**
 * Quick Sort<br>
 * <ul>
 *     <li>Divide and counter algorithm</li>
 *     <li>Recursive algorithm</li>
 *     <li>Uses a pivot element to partition the array into two parts</li>
 *     <li>Elements < pivot to its left, elements > pivot to its right</li>
 *     <li>Pivot will then be in its correct sorted position</li>
 *     <li>In-place algorithm</li>
 *     <li>O(n log n) - base 2. We're repeatedly partitioning the
 *     array into two halves</li>
 *     <li>Worst time is O(n^2), O(n) - base 3</li>
 *     <li>Unstable sort</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class QuickSort {
    /**
     * Merge Sort implementation method
     * @param input - source array
     * @param start - start position in the array
     * @param end   - middle position in the array increased by 1
     *              (like array size)
     */
    public static void sort(int[] input, int start, int end) {
        if (end - start < 2)
            return;

        int pivotIndex = partition(input, start, end);
        sort(input, start, pivotIndex);
        sort(input, pivotIndex + 1, end);
    }
    /**
     * Pivot position search method
     * @param input - source array
     * @param start - start position in the array
     * @param end - middle position in the array increased by 1
     *            (like array size)
     * @return {@code int} - new pivot index
     */
    private static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j) {
            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j)
                input[i] = input[j];
            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j)
                input[j] = input[i];
        }
        input[j] = pivot;

        return j;
    }
}
