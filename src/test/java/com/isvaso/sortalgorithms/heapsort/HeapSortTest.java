package com.isvaso.sortalgorithms.heapsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HeapSortTest {

    @Test
    void sort() {
        int[] sourceArray = { 80, 75, 60, 68, 55, 40, 52, 67 };
        int[] assertArray = { 40, 52, 55, 60, 67, 68, 75, 80 };

        HeapSort.sort(sourceArray);

        assertArrayEquals(assertArray, sourceArray);
    }
}