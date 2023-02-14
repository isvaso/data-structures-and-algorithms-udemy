package com.isvaso.sortalgorithms.challenge2;
/**
 * Sort Algorithms - Challenge #2
 * <br><br>
 * Change insertion sort so that it uses recursion
 * <br><br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class Challenge2 {
    /**
     * Recursion Insertion Sort implementation method
     * @param array source {@code int} array
     */
    public static void sort(int[] array, int numItems) {
        if (numItems < 2)
            return;

        sort(array, numItems - 1);

        int newElement = array[numItems - 1];
        int i;

        for (i = numItems - 1; i > 0 && array[i - 1] > newElement;
             i--) {
            array[i] = array[i - 1];
        }
        array[i] = newElement;
    }

}
