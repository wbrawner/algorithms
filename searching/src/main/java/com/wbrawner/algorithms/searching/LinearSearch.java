package com.wbrawner.algorithms.searching;

/**
 * Linear search begins at the first index, looping through each element of the array in order and comparing the
 * value at each index with the value being searched for.
 */
class LinearSearch {
    /**
     * Search the given array for the given element using the Linear search algorithm
     *
     * @return The index of the array where the element can be found or -1 if it can't be found
     */
    static int search(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }
}
