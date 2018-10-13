package com.wbrawner.algorithms.searching;

class SearchData {
    /**
     * Test helper method to get test data for searching tests
     *
     * @return a multidimensional array of unsorted and sorted arrays wrapped
     * in an array
     */
    static Object[][] get() {
        return new Object[][]{
                // First data set - unsorted array with even number of items
                new Object[]{
                        // Haystack
                        new int[]{5, 4, 1, 8, 7, 2, 6, 3},
                        // Needle
                        2,
                        // Expected index
                        5,
                },
                // Second data set - sorted array with even number of items
                new Object[]{
                        // Haystack
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8},
                        // Needle
                        2,
                        // Expected index
                        1,
                },
                // Third data set - unsorted array with odd number of items
                new Object[]{
                        // Haystack
                        new int[]{9, 5, 4, 1, 8, 7, 2, 6, 3},
                        // Needle
                        3,
                        // Expected index
                        8,
                },
                // Fourth data set - sorted array with odd number of items
                new Object[]{
                        // Haystack
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                        // Needle
                        7,
                        // Expected index
                        6,
                },
                // Fifth data set - empty array
                new Object[]{
                        // Haystack
                        new int[]{},
                        // Needle
                        4,
                        // Expected index
                        -1,
                },
                // Sixth data set - a single integer array
                new Object[]{
                        // Haystack
                        new int[]{1},
                        // Needle
                        1,
                        // Expected index
                        0,
                },
        };
    }
}
