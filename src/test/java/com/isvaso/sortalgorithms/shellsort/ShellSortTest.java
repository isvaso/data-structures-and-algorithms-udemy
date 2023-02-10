package com.isvaso.sortalgorithms.shellsort;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ShellSortTest {

    @Test
    void sort() {
        int[] intSourceArray = ArrayGenerator.getUnsortedIntArray();
        int[] intAssertArray = ArrayGenerator.getSortedIntArray();

        ShellSort.sort(intSourceArray);

        assertArrayEquals(intAssertArray, intSourceArray);
    }
}