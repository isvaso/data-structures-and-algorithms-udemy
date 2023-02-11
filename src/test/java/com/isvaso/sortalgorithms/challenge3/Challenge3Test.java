package com.isvaso.sortalgorithms.challenge3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Challenge3Test {

    @Test
    void sort() {
        String[] intSourceArray =
                { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb" };
        String[] intAssertArray = Arrays.copyOf(intSourceArray,
                intSourceArray.length);
        Arrays.sort(intAssertArray);

        Challenge3.sort(intSourceArray, 'z' - 'a' + 1, 5);

        assertArrayEquals(intAssertArray, intSourceArray);
    }
}