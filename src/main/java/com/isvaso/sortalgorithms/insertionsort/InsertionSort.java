package com.isvaso.sortalgorithms.insertionsort;
/**
 * Insertion Sort<br>
 * <ul>
 *     <li>In-place algorithm</li>
 *     <li>O(n^2) time complexity – quadratic</li>
 *     <li>It will take 100 steps to sort 10 items, 10.000 steps
 *     to sort 100 items, 1.000.000 steps to sort 1000 items</li>
 *     <li>Stable sort</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class InsertionSort {
    /**
     * Insertion Sort implementation method
     * @param array source {@code int} array
     */
    public static void sort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;
             firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement;
                 i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
    }
}
