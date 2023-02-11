package com.isvaso.sortalgorithms.radixsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {

    @Test
    void sort() {
        int[] unsortedIntArray = { 4725, 4586, 1330, 8792, 1594, 5729 };
        int[] intAssertArray = { 1330, 1594, 4586, 4725, 5729, 8792 };

        RadixSort.sortMy(unsortedIntArray, 10, 4);
        assertArrayEquals(intAssertArray, unsortedIntArray);
    }
}