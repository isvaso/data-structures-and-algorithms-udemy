package com.isvaso.sortalgorithms.shellsort;
/**
 * Shell Sort<br>
 * <ul>
 *     <li>Variation of insertion Sort</li>
 *     <li>Insertion sort choose which element to insert using a gap of 1</li>
 *     <li>Shell Sort starts out using a larger gap value</li>
 *     <li>As the algorithm runs, the fap is reduced</li>
 *     <li>Goal is to reduce the amount of shifting required</li>
 *     <li>In-place algorithm</li>
 *     <li>Difficult to nail down the time complexity because
 *     it will depend on the gap. Worst case: O(n^2),
 *     but it can perform much better than that: O(n log^2 n)</li>
 *     <li>Doesn't require as much shifting as insertion sort,
 *     so it usually performs better</li>
 *     <li>Unstable sort</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class ShellSort {
    /**
     * Shell Sort implementation method
     * @param array source integer array
     */
    public static void sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int firstUnsortedIndex = gap;
                 firstUnsortedIndex < array.length; firstUnsortedIndex++) {

                int newElement = array[firstUnsortedIndex];
                int i;

                for (i = firstUnsortedIndex;
                     i >= gap && array[i - gap] > newElement; i -= gap) {
                    array[i] = array[i - gap];
                }
                array[i] = newElement;
            }
        }
    }
}
