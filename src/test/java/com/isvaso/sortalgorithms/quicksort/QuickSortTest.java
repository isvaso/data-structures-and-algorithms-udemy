package com.isvaso.sortalgorithms.quicksort;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class QuickSortTest {

    @Test
    void sort() {
        int[] intSourceArray = ArrayGenerator.getUnsortedIntArray();
        int[] intAssertArray = Arrays.copyOf(intSourceArray,
                intSourceArray.length);
        Arrays.sort(intAssertArray);

        QuickSort.sort(intSourceArray, 0, intSourceArray.length);

        Assertions.assertArrayEquals(intAssertArray, intSourceArray);
    }
}