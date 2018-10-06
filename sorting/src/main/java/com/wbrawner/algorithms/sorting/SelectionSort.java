package com.wbrawner.algorithms.sorting;

/**
 * The Selection Sort algorithm modifies an array in place, finding the
 * minimum value that hasn't been sorted, and swapping it with the first
 * unsorted value.
 */
public class SelectionSort {
    /**
     * Sort a given array of ints using the Selection Sort algorithm
     *
     * @param array an unsorted array of ints
     * @return a sorted array of ints
     */
    public static int[] sort(int[] array) {
        // An empty array or array with only a single value can't be sorted
        if (array.length < 2) {
            return array;
        }

        for (int i = 0; i < array.length; i++) {
            int minPos = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }
            int min = array[minPos];
            array[minPos] = array[i];
            array[i] = min;
        }

        return array;
    }
}
