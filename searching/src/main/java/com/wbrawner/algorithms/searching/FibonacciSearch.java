package com.wbrawner.algorithms.searching;

/**
 * Fibonacci search requires the array to be sorted, and works by using Fibonacci numbers as indexes to divide the
 * array and compare linearly against its members
 */
class FibonacciSearch {
    /**
     * Search the given array for the given element using the Binary search algorithm
     *
     * @return The index of the array where the element can be found or -1 if it can't be found
     */
    static int search(int[] array, int element) {
        // If the array is empty, it doesn't contain the element we're searching for
        if (array.length == 0) {
            return -1;
        }

        // If the array only has a single element, simply compare it
        if (array.length == 1) {
            return array[0] == element ? 0 : -1;
        }


        int[] fibonacciNumbers = new int[]{0, 1, 1};
        while (fibonacciNumbers[2] < array.length) {
            incrementFibonacci(fibonacciNumbers, 1);
        }

        int offset = -1;

        while (fibonacciNumbers[2] > 1) {
            int index = Math.min(offset + fibonacciNumbers[0], array.length - 1);

            if (array[index] > element) {
                decrementFibonacci(fibonacciNumbers, 1);
                continue;
            }

            if (array[index] < element) {
                decrementFibonacci(fibonacciNumbers, 2);
                offset = index;
                continue;
            }

            return index;
        }

        if (array[Math.min(offset + 1, array.length - 1)] == element) {
            return offset + 1;
        }

        return -1;
    }

    private static void incrementFibonacci(int[] fibonacciNumbers, int amount) {
        for (int i = 0; i < amount; i++) {
            fibonacciNumbers[0] = fibonacciNumbers[1];
            fibonacciNumbers[1] = fibonacciNumbers[2];
            fibonacciNumbers[2] = fibonacciNumbers[1] + fibonacciNumbers[0];
        }
    }

    private static void decrementFibonacci(int[] fibonacciNumbers, int amount) {
        for (int i = 0; i < amount; i++) {
            fibonacciNumbers[2] = fibonacciNumbers[1];
            fibonacciNumbers[1] = fibonacciNumbers[0];
            fibonacciNumbers[0] = fibonacciNumbers[2] - fibonacciNumbers[1];
        }
    }
}
