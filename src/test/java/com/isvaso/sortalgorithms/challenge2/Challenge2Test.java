package com.isvaso.sortalgorithms.challenge2;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Challenge2Test {

    @Test
    void sort() {
        int[] intSourceArray = ArrayGenerator.getUnsortedIntArray();
        int[] intAssertArray = Arrays.copyOf(intSourceArray,
                intSourceArray.length);
        Arrays.sort(intAssertArray);

        Challenge2.sort(intSourceArray, intSourceArray.length);

        assertArrayEquals(intAssertArray, intSourceArray);
    }
}