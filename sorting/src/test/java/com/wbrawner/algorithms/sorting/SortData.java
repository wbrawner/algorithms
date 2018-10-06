package com.wbrawner.algorithms.sorting;

public class SortData {
    /**
     * Test helper method to get test data for sorting tests
     *
     * @return a multidimensional array of unsorted and sorted arrays wrapped
     * in an array
     */
    public static int[][][] get() {
        return new int[][][]{
                // First data set - even number of integers with no repeats
                new int[][]{
                        // Unsorted values
                        new int[]{5, 4, 1, 8, 7, 2, 6, 3},
                        // Sorted values
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8}
                },
                // Second data set - odd number of integers with no repeats
                new int[][]{
                        // Unsorted values
                        new int[]{9, 5, 4, 1, 8, 7, 2, 6, 3},
                        // Sorted values
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}
                },
                // Third data set - even number of integers with repeats
                new int[][]{
                        // Unsorted values
                        new int[]{9, 5, 4, 4, 8, 7, 2, 6, 3},
                        // Sorted values
                        new int[]{2, 3, 4, 4, 5, 6, 7, 8, 9}
                },
                // Fourth data set - odd number of integers with repeats
                new int[][]{
                        // Unsorted values
                        new int[]{9, 5, 4, 4, 8, 7, 2, 6, 3, 5},
                        // Sorted values
                        new int[]{2, 3, 4, 4, 5, 5, 6, 7, 8, 9}
                },
                // Fifth data set - empty array
                new int[][]{
                        // Unsorted values
                        new int[]{},
                        // Sorted values
                        new int[]{}
                },
                // Sixth data set - a single integer array
                new int[][]{
                        // Unsorted values
                        new int[]{1},
                        // Sorted values
                        new int[]{1}
                },
                // Seventh data set - a reverse sorted array
                new int[][]{
                        // Unsorted values
                        new int[]{100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0},
                        // Sorted values
                        new int[]{0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
                },
                // Eight data set - an already sorted array
                new int[][]{
                        // Unsorted values
                        new int[]{0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100},
                        // Sorted values
                        new int[]{0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
                },
        };
    }
}
