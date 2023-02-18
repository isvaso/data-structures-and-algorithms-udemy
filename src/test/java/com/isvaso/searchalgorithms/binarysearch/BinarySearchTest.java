package com.isvaso.searchalgorithms.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    int[] intArray = { -21, -11, -2, 0, 1, 20, 66, 100, 144 };

    @Test
    void iterativeSearch() {
        assertEquals(7,
                BinarySearch.iterativeSearch(intArray, 100));
        assertEquals(1,
                BinarySearch.iterativeSearch(intArray, -11));
        assertEquals(5,
                BinarySearch.iterativeSearch(intArray, 20));
        assertEquals(-1,
                BinarySearch.iterativeSearch(intArray, 666));
    }

    @Test
    void recursiveSearch() {
        assertEquals(7,
                BinarySearch.recursiveSearch(intArray, 100));
        assertEquals(1,
                BinarySearch.recursiveSearch(intArray, -11));
        assertEquals(5,
                BinarySearch.recursiveSearch(intArray, 20));
        assertEquals(-1,
                BinarySearch.recursiveSearch(intArray, 666));
    }
}