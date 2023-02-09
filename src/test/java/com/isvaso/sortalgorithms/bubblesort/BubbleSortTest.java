package com.isvaso.sortalgorithms.bubblesort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sort() {
        int[] intSourceArray = { 5, -5, 12, 1, 22, 3, 73, 13, -1 };
        int[] intAssertArray = { -5, -1, 1, 3, 5, 12, 13, 22, 73 };

        BubbleSort.sort(intSourceArray);

        Arrays.stream(intSourceArray)
                .forEach(System.out::println);

        assertArrayEquals(intAssertArray, intSourceArray);
    }
}