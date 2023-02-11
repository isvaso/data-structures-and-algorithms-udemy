package com.isvaso.sortalgorithms.challenge1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Challenge1Test {

    @Test
    void sort() {
        int[] intSourceArray = { 5, 2, 4, 1, 6 };
        int[] intAssertArray = { 6, 5, 4, 2, 1 };

        Challenge1.sort(intSourceArray, 0, intSourceArray.length);

        assertArrayEquals(intAssertArray, intSourceArray);
    }
}