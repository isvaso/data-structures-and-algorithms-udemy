package com.isvaso.sortalgorithms.selectionsort;
/**
 * Selection Sort<br>
 * <ol>
 *     <li>In-place algorithm</li>
 *     <li>O(n^2) time complexity – quadratic</li>
 *     <li>It will take 100 steps to sort 10 items, 10.000 steps
 *     to sort 100 items, 1.000.000 steps to sort 1000 items</li>
 *     <li>Doesn't require as much swapping as bubble sort</li>
 *     <li>Unstable sort</li>
 * </ol>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class SelectionSort {
    /**
     /**
     * Selection Sort implementation method
     * @param array - source integer array
     */
    public static void sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest])
                    largest = i;
            }
            swap(array, largest, lastUnsortedIndex);
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
