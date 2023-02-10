package com.isvaso.sortalgorithms.selectionsort;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import com.isvaso.sortalgorithms.bubblesort.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {

    @Test
    void sort() {
        int[] intSourceArray = ArrayGenerator.getUnsortedIntArray();
        int[] intAssertArray = Arrays.copyOf(intSourceArray,
                intSourceArray.length);
        Arrays.sort(intAssertArray);

        BubbleSort.sort(intSourceArray);

        assertArrayEquals(intAssertArray, intSourceArray);
    }
}