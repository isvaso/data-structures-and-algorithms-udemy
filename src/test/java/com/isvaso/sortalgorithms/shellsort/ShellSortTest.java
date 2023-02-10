package com.isvaso.sortalgorithms.shellsort;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ShellSortTest {

    @Test
    void sort() {
        int[] intSourceArray = ArrayGenerator.getUnsortedIntArray();
        int[] intAssertArray = Arrays.copyOf(intSourceArray,
                intSourceArray.length);
        Arrays.sort(intAssertArray);

        ShellSort.sort(intSourceArray);

        assertArrayEquals(intAssertArray, intSourceArray);
    }
}