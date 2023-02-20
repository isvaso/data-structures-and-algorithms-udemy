package com.isvaso.heaps.maxheap;

/**
 * Max Heap implementation
 * <br>
 * <ul>
 *     <li>A complete binary tree</li>
 *     <li>Must satisfy the heap property</li>
 *     <li>Max heap: Every parent greater tan or equal to its children</li>
 *     <li>Min heap: Every parent less tan or equal to its children</li>
 *     <li>A binary heap must be a complete binary tree</li>
 *     <li>Children are added at each level from left to right</li>
 *     <li>Usually implemented as array</li>
 *     <li>The maximum or minimum value will always be at the roof
 *     of tree - the advantage of using a heap</li>
 *     <li>Heapify - process of converting a binary tree into a heap -
 *     this often has to be done after an insertion or deletion</li>
 *     <li>No required ordering between siblings</li>
 * </ul>
 * <br>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class MaxHeap {

    private int[] heap;
    private int size;

    /**
     * Heap constructor
     * @param capacity {@code int} size of the heap
     */
    public MaxHeap(int capacity) {
        this.heap = new int[capacity];
    }

    /**
     * Method inserts new {@code int } value into the heap
     * @param value {@code int} to be added
     * @return {@code Three} for fluent builder
     */
    public MaxHeap insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }

        heap[size] = value;

        fixHeapAbove(size);
        size++;

        return this;
    }

    /**
     * Method deletes {@code int} value by its {@code int} index in the heap
     * @param index {@code int} of value to be deleted
     * @return {@code int} index of deleted value
     */
    public int deleteByIndex(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap  is empty");
        }

        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];

        if (index == 0 || heap[index] < heap[parent]) {
            fixHeapBelow(index);
        } else {
            fixHeapAbove(index);
        }

        size--;

        return deletedValue;
    }

    /**
     * Method deletes {@code int} value from the heap
     * @param value {@code int} to be deleted
     */
    public void deleteByValue(int value) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        int j = 0;

        while (j <= size - 1) {
            if (heap[j] == value) {
                deleteByIndex(j);
                return;
            }
            j++;
        }
    }

    /**
     * Method sorts the heap in native order
     */
    public void sort() {
        int lastHeapIndex = size - 1;

        for (int i = 0; i < lastHeapIndex; i++) {
            int temp = heap[0];
            heap[0] = heap[lastHeapIndex - i];
            heap[lastHeapIndex - i] = temp;

            fixHeapBelowToIndex(0, lastHeapIndex - i - 1);
        }
    }

    /**
     * Method fixes the heap values above {@code int} index
     * @param index {@code int} above which the heap will be fixed
     */
    private void fixHeapAbove(int index) {
        int newValue = heap[index];

        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }

        heap[index] = newValue;
    }

    /**
     * Method fixes the heap values below {@code int} index
     * @param index {@code int} below which the heap will be fixed
     */
    private void fixHeapBelow(int index) {
        fixHeapBelowToIndex(index, size - 1);
    }

    /**
     * Method fixes the heap values below {@code int}
     * up to the {@code int} index that won't be fixed
     * @param index {@code int} below which the heap will be fixed
     * @param lastHeapIndex {@code int} index that won't be fixed
     */
    private void fixHeapBelowToIndex(int index, int lastHeapIndex) {
        int childToSwap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = (heap[leftChild] > heap[rightChild]
                            ? leftChild : rightChild);
                }
                if (heap[index] < heap[childToSwap]) {
                    int temp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;
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
     * Method prints heap's values
     */
    public void printHeap() {
        for (int i = 0; i < size - 1; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    /**
     * Method checks if the heap is full
     * @return {@code Boolean} true if is full
     * and {@code Boolean} false if is not
     */
    public boolean isFull() {
        return size == heap.length;
    }

    /**
     * Method checks if the heap is empty
     * @return {@code Boolean} true if is full
     * and {@code Boolean} false if is not
     */

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Method returns {@code int} value of the head of the heap
     * @return
     */
    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Hep is empty");
        }
        return heap[0];
    }

    /**
     * Method returns {@code int} index of parent of {@code int} index
     * @param index {@code int} whose parent should be returned
     * @return {@code int} parent index
     */
    public int getParent(int index) {
        return (index - 1) / 2;
    }
    /**
     * Method returns {@code int} index of left child or right child
     * of {@code int} index
     * @param index {@code int} whose parent should be returned
     * @param left {@code Boolean} true if the left child is needed,
     *             {@code Boolean} false if the right child is needed
     * @return {@code int} child index
     */
    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

    /**
     * Method returns heap as array
     * @return {@code int} array
     */
    public int[] asArray() {
        int[] result = new int[size];
        System.arraycopy(heap, 0, result, 0, result.length);
        return result;
    }
}
