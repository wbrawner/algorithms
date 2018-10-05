package com.wbrawner.algorithms.sorting;

import java.util.Arrays;

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

    private static int[] merge(int[] first, int[] second) {
        // Create a new array that can hold both of the given arrays
        int[] sorted = new int[first.length + second.length];
        // Three values are used here:
        // i - keeps track of the sorted array's index
        // j - keeps track of the first array's index
        // k - keeps track of the second array's index
        int i, j = 0, k = 0;
        for (i = 0; i < sorted.length; i++) {
            // If we still have values from the first array...
            if (j < first.length
                    // ... and we either don't have values from the second
                    // array or the value at the current index of the first
                    // array is less than the value at the current index of
                    // the second array...
                    && (k >= second.length || first[j] < second[k])
                    ) {
                // ... then we append the value at the current index of the
                // first array to the sorted array.
                sorted[i] = first[j];
                j++;
            } else if (k < second.length) {
                // In any other case, we should add the value at the current
                // index of the second array
                sorted[i] = second[k];
                k++;
            }
        }
        return sorted;
    }
}
