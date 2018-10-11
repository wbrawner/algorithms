package com.wbrawner.algorithms.sorting;

public class SortUtils {
    public static int[] merge(int[] first, int[] second) {
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

    public static void swap(int[] array, int firstPos, int secondPos) {
        int firstValue = array[firstPos];
        array[firstPos] = array[secondPos];
        array[secondPos] = firstValue;
    }
}
