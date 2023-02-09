package com.isvaso.sortalgorithms.bubblesort;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    @Test
    void sort() {
        int[] intSourceArray = ArrayGenerator.getUnsortedIntArray();
        int[] intAssertArray = ArrayGenerator.getSortedIntArray();

        BubbleSort.sort(intSourceArray);

        Arrays.stream(intSourceArray)
                .forEach(System.out::println);

        assertArrayEquals(intAssertArray, intSourceArray);
    }
}