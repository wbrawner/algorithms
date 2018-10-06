package com.wbrawner.algorithms.sorting;

/**
 * The Insertion Sort algorithm modifies an array in place, removing the
 * first untouched index and iterating over the already sorted indices
 * to position the removed index correctly.
 */
public class InsertionSort {
    /**
     * Sort a given array of ints using the Insertion Sort algorithm
     *
     * @param array an unsorted array of ints
     * @return a sorted array of ints
     */
    public static int[] sort(int[] array) {
        // An empty array or array with only a single value can't be sorted
        if (array.length < 2) {
            return array;
        }

        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentValue;
        }

        return array;
    }
}
