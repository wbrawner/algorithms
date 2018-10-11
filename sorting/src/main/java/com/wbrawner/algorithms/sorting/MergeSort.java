package com.wbrawner.algorithms.sorting;

import java.util.Arrays;

import static com.wbrawner.algorithms.sorting.SortUtils.merge;

/**
 * The Merge Sort algorithm works by the "divide and conquer" strategy. The
 * given array of data is recursively split into two smaller arrays that are
 * sorted individually before being merged back together.
 */
public class MergeSort {
    /**
     * Sort a given array of ints using the Merge Sort algorithm
     *
     * @param unsorted an unsorted array of ints
     * @return a sorted array of ints
     */
    public static int[] sort(int[] unsorted) {
        // An empty array or array with only a single value can't be sorted
        if (unsorted.length < 2) {
            return unsorted;
        }

        // Since the array has at least 2 elements, we should evenly (or as
        // close as possible to evenly) split it, sort the values, and merge
        // them back together
        int midPoint = unsorted.length / 2;
        int[] first = Arrays.copyOfRange(unsorted, 0, midPoint);
        int[] second = Arrays.copyOfRange(unsorted, midPoint, unsorted.length);
        return merge(
                sort(first),
                sort(second)
        );
    }
}
