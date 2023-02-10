package com.isvaso.sortalgorithms.insertionsort;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    @Test
    void sort() {
        int[] intSourceArray = ArrayGenerator.getUnsortedIntArray();
        int[] intAssertArray = Arrays.copyOf(intSourceArray,
                intSourceArray.length);
        Arrays.sort(intAssertArray);

        InsertionSort.sort(intSourceArray);

        assertArrayEquals(intAssertArray, intSourceArray);
    }
}