package com.isvaso.sortalgorithms.selectionsort;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import com.isvaso.sortalgorithms.bubblesort.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {

    @Test
    void sort() {
        int[] intSourceArray = ArrayGenerator.getUnsortedIntArray();
        int[] intAssertArray = ArrayGenerator.getSortedIntArray();

        BubbleSort.sort(intSourceArray);

        assertArrayEquals(intAssertArray, intSourceArray);
    }
}