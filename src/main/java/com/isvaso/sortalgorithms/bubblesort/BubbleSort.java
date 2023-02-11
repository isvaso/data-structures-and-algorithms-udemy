package com.isvaso.sortalgorithms.bubblesort;
/**
 * Bubble Sort<br>
 * <ul>
 *     <li>In-place algorithm</li>
 *     <li>O(n^2) time complexity – quadratic</li>
 *     <li>It will take 100 steps to sort 10 items, 10.000 steps
 *     to sort 100 items, 1.000.000 steps to sort 1000 items</li>
 *     <li>Algorithm degrades quickly</li>
 *     <li>Stable sort</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class BubbleSort {
    /**
     * Bubble Sort implementation method
     * @param array source {@code int} array
     */
    public static void sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }
    /**
     * Method for swapping two elements in an array
     * @param array source integer array
     * @param i index of first element
     * @param j index of second element
     */
    private static void swap(int[] array, int i, int j) {
        if (i == j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
