package com.isvaso.sortalgorithms.arraygenerator;

import java.util.Random;

public class ArrayGenerator {

    private static final int[] unsortedIntArray =
            generateIntArray(10, false);
    private static final int[] unsortedPositiveIntArray =
            generateIntArray(10, true);

    private static int[] generateIntArray(int length, boolean positiveFlag) {
        Random random = new Random();
        int[] resultArray = new int[length];

        for (int i = 0; i < resultArray.length; i++)
            if (!positiveFlag)
                resultArray[i] = random.nextInt(-10, 10);
            else
                resultArray[i] = random.nextInt(0, 10);
            return resultArray;
    }

    public static int[] getUnsortedIntArray() {
        return unsortedIntArray;
    }

    public static int[] getUnsortedPositiveIntArray() {
        return unsortedPositiveIntArray;
    }
}
