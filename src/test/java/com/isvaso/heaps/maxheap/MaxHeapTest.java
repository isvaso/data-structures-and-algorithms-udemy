package com.isvaso.heaps.maxheap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxHeapTest {

    MaxHeap maxHeap;

    @BeforeEach
    void beforeEach() {
        maxHeap = new MaxHeap(10);
        maxHeap.insert(80)
                .insert(75)
                .insert(60)
                .insert(68)
                .insert(55)
                .insert(40)
                .insert(52)
                .insert(67);
    }

    @Test
    void insert() {
        int[] assertArray = { 100, 80, 60, 75, 55, 40, 52, 67, 68 };
        maxHeap.insert(100);

        assertArrayEquals(assertArray, maxHeap.asArray());
    }

    @Test
    void deleteByIndex() {
        int[] assertArray = { 80, 75, 67, 68, 55, 40, 52 };
        maxHeap.deleteByIndex(2);

        assertArrayEquals(assertArray, maxHeap.asArray());
    }

    @Test
    void deleteByValue() {
        int[] assertArray = { 80, 75, 67, 68, 55, 40, 52 };
        maxHeap.deleteByValue(60);

        assertArrayEquals(assertArray, maxHeap.asArray());
    }

    @Test
    void sort() {
        int[] assertArray = { 40, 52, 55, 60, 67, 68, 75, 80 };
        maxHeap.sort();

        assertArrayEquals(assertArray, maxHeap.asArray());
    }

    @Test
    void printHeap() {
        maxHeap.printHeap();
    }

    @Test
    void isFull() {
        assertFalse(maxHeap.isFull());

        maxHeap.insert(85)
                .insert(79);

        assertTrue(maxHeap.isFull());
    }

    @Test
    void isEmpty() {
        assertFalse(maxHeap.isEmpty());

        MaxHeap emptyMaxHeap = new MaxHeap(10);
        assertTrue(emptyMaxHeap.isEmpty());
    }

    @Test
    void getParent() {
        assertEquals(0, maxHeap.getParent(1));
        assertEquals(1, maxHeap.getParent(4));
        assertEquals(3, maxHeap.getParent(7));
    }

    @Test
    void getChild() {
        assertEquals(2, maxHeap.getChild(0, false));
        assertEquals(1, maxHeap.getChild(0, true));
        assertEquals(3, maxHeap.getChild(1, true));
    }

    @Test
    void peek() {
        assertEquals(80, maxHeap.peek());
        maxHeap.deleteByIndex(0);
        assertEquals(75, maxHeap.peek());
    }
}