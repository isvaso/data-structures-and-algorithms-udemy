package com.isvaso.sortalgorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {5, -5, 12, 1, 22, 3, 73, 13, -1 };

        BubbleSort.sort(intArray);

        Arrays.stream(intArray)
                .forEach(System.out::println);
    }
}
