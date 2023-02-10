package com.isvaso.sortalgorithms.quicksort;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickSortTest {

    @Test
    void sort() {
        int[] intSourceArray = ArrayGenerator.getUnsortedIntArray();
        int[] intAssertArray = ArrayGenerator.getSortedIntArray();

        QuickSort.sort(intSourceArray, 0, intSourceArray.length);

        Assertions.assertArrayEquals(intAssertArray, intSourceArray);
    }
}