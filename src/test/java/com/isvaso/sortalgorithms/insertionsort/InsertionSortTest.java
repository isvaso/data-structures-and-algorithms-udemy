package com.isvaso.sortalgorithms.insertionsort;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    @Test
    void sort() {
        int[] intSourceArray = ArrayGenerator.getUnsortedIntArray();
        int[] intAssertArray = ArrayGenerator.getSortedIntArray();

        InsertionSort.sort(intSourceArray);

        assertArrayEquals(intAssertArray, intSourceArray);
    }
}