package com.wbrawner.algorithms.sorting;

/**
 * The Bubble Sort algorithm modifies an array in place, continuously
 * looping through the array and swapping elements that are unsorted until no
 * elements have been swapped.
 */
public class BubbleSort {
    /**
     * Sort a given array of ints using the Bubble Sort algorithm
     *
     * @param array an unsorted array of ints
     * @return a sorted array of ints
     */
    public static int[] sort(int[] array) {
        // An empty array or array with only a single value can't be sorted
        if (array.length < 2) {
            return array;
        }

        boolean swapsMade;
        do {
            swapsMade = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int currentValue = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = currentValue;
                    swapsMade = true;
                }
            }
        } while (swapsMade);

        return array;
    }
}
