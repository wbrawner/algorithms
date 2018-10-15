package com.wbrawner.algorithms.searching;

/**
 * Jump search requires the array to be sorted, and works by "jumping" through the array by segments that are as long
 * as the square root of the length of the array until it finds a value greater than the value being searched for, at
 * which point it returns to the index of the previous value it had and uses the linear search method to find the
 * given value.
 */
class JumpSearch {
    /**
     * Search the given array for the given element using the Jump search algorithm
     *
     * @return The index of the array where the element can be found or -1 if it can't be found
     */
    static int search(int[] array, int element) {
        if (array.length == 0) {
            return -1;
        }

        if (array.length == 1) {
            return array[0] == element ? 0 : -1;
        }

        final int jumpSize = (int) Math.sqrt(array.length);
        int jumpCount = 0;
        while (true) {
            int index = jumpSize * jumpCount;
            if (index >= array.length) {
                return -1;
            }

            if (array[index] == element) {
                return index;
            }

            if (array[index] < element) {
                jumpCount++;
                continue;
            }

            if (array[index] > element) {
                for (int i = index - jumpSize; i < index; i++) {
                    if (array[i] == element) {
                        return i;
                    }
                }

                return -1;
            }
        }
    }
}
