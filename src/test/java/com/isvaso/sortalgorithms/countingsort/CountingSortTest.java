package com.isvaso.sortalgorithms.countingsort;

import com.isvaso.sortalgorithms.arraygenerator.ArrayGenerator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountingSortTest {

    @Test
    void sort() {
        int[] intSourceArray = ArrayGenerator.getUnsortedPositiveIntArray();

        OptionalInt optionalMin = Arrays.stream(intSourceArray).min();
        OptionalInt optionalMax = Arrays.stream(intSourceArray).max();

        int min = 0;
        int max = 0;

        if (optionalMin.isPresent()) {
            min = optionalMin.getAsInt();
            max = optionalMax.getAsInt();
        } else {
            throw new NoSuchElementException("Min and Max not found");
        }

        int[] intAssertArray = Arrays.copyOf(intSourceArray,
                intSourceArray.length);
        Arrays.sort(intAssertArray);

        CountingSort.sort(intSourceArray, min, max);

        assertArrayEquals(intAssertArray, intSourceArray);
    }
}