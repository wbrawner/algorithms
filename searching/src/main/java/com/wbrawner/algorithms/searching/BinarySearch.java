package com.wbrawner.algorithms.searching;

/**
 * Binary search requires the array to be sorted, and works by continuously splitting the array in half until it
 * finds the element being searched for
 */
class BinarySearch {
    /**
     * Search the given array for the given element using the Binary search algorithm
     *
     * @return The index of the array where the element can be found or -1 if it can't be found
     */
    static int search(int[] array, int element) {
        if (array.length == 0) {
            return -1;
        }

        return search(array, element, 0, array.length - 1);
    }


    private static int search(int[] array, int element, int begin, int end) {
        int midPoint = begin + ((end - begin) / 2);

        if (midPoint == begin) {
            if (array[midPoint] == element) {
                return midPoint;
            }

            if (array[end] == element) {
                return end;
            }

            return -1;
        }

        if (array[midPoint] > element) {
            return search(array, element, begin, midPoint);
        }

        if (array[midPoint] < element) {
            return search(array, element, midPoint, end);
        }

        return midPoint;
    }
}
