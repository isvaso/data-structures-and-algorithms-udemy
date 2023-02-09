package com.isvaso.sortalgorithms.arraygenerator;

import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {

    private static final int[] unsortedIntArray = generateIntArray(10);

    private static int[] generateIntArray(int length) {
        Random random = new Random();
        int[] resultArray = new int[length];

        for (int i = 0; i < resultArray.length; i++)
            resultArray[i] = random.nextInt(-10, 10);

        return resultArray;
    }

    public static int[] getUnsortedIntArray() {
        return unsortedIntArray;
    }

    public static int[] getSortedIntArray() {
        int[] resultArray = new int[unsortedIntArray.length];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = unsortedIntArray[i];
        }

        Arrays.sort(resultArray);

        return resultArray;
    }
}
