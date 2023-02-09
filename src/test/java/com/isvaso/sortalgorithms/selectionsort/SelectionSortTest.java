package com.isvaso.sortalgorithms.selectionsort;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import com.isvaso.sortalgorithms.bubblesort.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

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