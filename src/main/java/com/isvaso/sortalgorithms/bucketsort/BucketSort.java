package com.isvaso.sortalgorithms.bucketsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Bucket Sort<br>
 * <ul>
 *     <li>Uses hashing</li>
 *     <li>Makes assumptions about the data, like radix and counting sor</li>
 *     <li>Because it makes assumptions, can sort in O(n) time</li>
 *     <li>Perform best when hashed values of items being sorted are
 *     evenly distributed, so there aren't many collisions</li>
 *     <li>Not in-place</li>
 *     <li>Stability will depend on sort algorithm used to sort
 *     the bucket - ideally, you want a stable sort</li>
 *     <li>To achieve O(n), must have only one item per bucket/li>
 *     <li>Insertion sort is often used to sort the buckets,
 *     because it is fast when the number of items is small</li>
 * </ul>
 * "Data Structures and Algorithms: Deep Dive Using Java" course on Udemy.
 */
public class BucketSort {

    /**
     * Bucket Sort implementation method
     * @param input source {@code int} array
     */
    public static void sort(int[] input) {
        List<Integer>[] bucketList = new List[10];

        for (int i = 0; i < bucketList.length; i++) {
            // Using LinkedList for the buckets
            //buckets[i] = new LinkedList<Integer>();

            // Using ArrayList for the buckets
            bucketList[i] = new ArrayList<>();
        }

        for (int i = 0; i < input.length; i++) {
            bucketList[hash(input[i])].add(input[i]);
        }

        int j = 0;

        for (List<Integer> integers : bucketList) {
            Collections.sort(integers);

            for (int v : integers)
                input[j++] = v;
        }
    }

    /**
     * Method generates {@code int} hash code
     * @param value {@code int} which will be used to generate the hash code
     * @return {@code int} hash code
     */
    private static int hash(int value) {
        return value / (int) 10;
    }

}
