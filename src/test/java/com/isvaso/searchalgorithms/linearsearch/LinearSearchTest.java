package com.isvaso.searchalgorithms.linearsearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinearSearchTest {

    @Test
    void search() {
        int[] intArray = { 20, 5, -11, -6, 100, 99, 20, 5, 0 };

        LinearSearch.search(intArray, -11);

        assertEquals(4, LinearSearch.search(intArray, 100));
        assertEquals(2, LinearSearch.search(intArray, -11));
        assertEquals(0, LinearSearch.search(intArray, 20));
        assertEquals(-1, LinearSearch.search(intArray, 666));
    }
}