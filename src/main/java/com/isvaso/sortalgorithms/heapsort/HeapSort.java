package com.isvaso.sortalgorithms.heapsort;

/**
 * Heap Sort Algorithm implementation
 * <br>
 * <ul>
 *     <li>Heap Sort Algorithm work with array as with a heap</li>
 *     <li>Therefore, before sort
 *     the first value of the array [0] must be the largest</li>
 *     <li>Time complexity is O(n log n)</li>
 * </ul>
 * <br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class HeapSort {

    /**
     * Method implements Heap Sort Algorithm
     * @param input {@code int} array to sort
     */
    public static void sort(int[] input) {
        int lastHeapIndex = input.length - 1;

        for (int i = 0; i < lastHeapIndex; i++) {
            int temp = input[0];
            input[0] = input[lastHeapIndex - i];
            input[lastHeapIndex - i] = temp;

            fixHeapBelowToIndex(input, 0, lastHeapIndex - i - 1);
        }
    }

    /**
     * Method fixes the heap values below {@code int}
     * up to the {@code int} index that won't be fixed
     * @param input {@code int} heap array
     * @param index {@code int} below which the heap will be fixed
     * @param lastHeapIndex {@code int} index that won't be fixed
     */
    private static void fixHeapBelowToIndex(int[] input,
                                     int index, int lastHeapIndex) {
        int childToSwap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = (input[leftChild] > input[rightChild]
                            ? leftChild : rightChild);
                }
                if (input[index] < input[childToSwap]) {
                    int temp = input[index];
                    input[index] = input[childToSwap];
                    input[childToSwap] = temp;
                } else {
                    break;
                }

                index = childToSwap;
            } else {
                break;
            }
        }
    }

    /**
     * Method returns {@code int} index of left child or right child
     * of {@code int} index
     * @param index {@code int} whose parent should be returned
     * @param left {@code Boolean} true if the left child is needed,
     *             {@code Boolean} false if the right child is needed
     * @return {@code int} child index
     */
    private static int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

}
