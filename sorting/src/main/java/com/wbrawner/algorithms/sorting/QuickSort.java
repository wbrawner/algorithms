package com.wbrawner.algorithms.sorting;

import java.util.concurrent.ThreadLocalRandom;

import static com.wbrawner.algorithms.sorting.SortUtils.swap;

/**
 * The Quick Sort algorithm works by the "divide and conquer" strategy. This
 * particular implementation uses the original
 * <a href="https://en.wikipedia.org/wiki/Quicksort#Hoare_partition_scheme">
 * Hoare partition scheme
 * </a>
 */
public class QuickSort {
    /**
     * Sort a given array of ints using the Quick Sort algorithm
     *
     * @param unsorted an unsorted array of ints
     * @return a sorted array of ints
     */
    public static int[] sort(int[] unsorted) {
        return sort(unsorted, 0, unsorted.length - 1);
    }

    private static int[] sort(int[] unsorted, int low, int high) {
        // An empty array or array with only a single value can't be sorted
        if (unsorted.length < 2 || low >= high) {
            return unsorted;
        }

        int partition = partition(unsorted, low, high);
        sort(unsorted, low, partition);
        sort(unsorted, partition + 1, high);
        return unsorted;
    }


    /**
     * Helper method used to iterate through the array from both ends until
     * both iterators meet in the middle, at which point it returns the index
     *
     * @param subArray
     * @param low
     * @param high
     * @return
     */
    private static int partition(int[] subArray, int low, int high) {
        int pivot = subArray[ThreadLocalRandom.current().nextInt(low, high)];
        int i = low;
        int j = high;
        while (true) {
            while (subArray[i] < pivot) {
                i++;
            }

            while (subArray[j] > pivot) {
                j--;
            }

            if (i >= j || (j - 1 > 1 && subArray[i] == subArray[j])) {
                return j;
            }

            if (subArray[i] == subArray[j]) {
                return i;
            }

            swap(subArray, i, j);
        }
    }
}
