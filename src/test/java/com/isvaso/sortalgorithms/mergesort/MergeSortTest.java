package com.isvaso.sortalgorithms.mergesort;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTest {

    @Test
    void sort() {
        int[] intSourceArray = ArrayGenerator.getUnsortedIntArray();
        int[] intAssertArray = ArrayGenerator.getSortedIntArray();

        MergeSort.sort(intSourceArray, 0, intSourceArray.length);

        Assertions.assertArrayEquals(intAssertArray, intSourceArray);
    }
}