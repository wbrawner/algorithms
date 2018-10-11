package com.wbrawner.algorithms.sorting;

import static com.wbrawner.algorithms.sorting.SortUtils.swap;

/**
 * The Heap Sort algorithm works by first organizing the data in a heap and
 * then sorting it.
 */
public class HeapSort {
    /**
     * Sort a given array of ints using the Heap Sort algorithm
     *
     * @param unsorted an unsorted array of ints
     * @return a sorted array of ints
     */
    public static int[] sort(int[] unsorted) {
        // An empty array or array with only a single value can't be sorted
        if (unsorted.length < 2) {
            return unsorted;
        }

        buildMaxHeap(unsorted);

        int end = unsorted.length - 1;
        while (end > 0) {
            swap(unsorted, end, 0);
            end--;
            siftDown(unsorted, 0, end);
        }

        return unsorted;
    }


    private static void buildMaxHeap(int[] unsorted) {
        int startIndex = getParentIndex(unsorted.length - 1);

        while (startIndex >= 0) {
            siftDown(unsorted, startIndex, unsorted.length - 1);
            startIndex--;
        }
    }


    private static void siftDown(int[] array, int start, int end) {
        int root = start;
        int child;
        while ((child = getLeftChild(root)) <= end) {
            int swap = root;

            if (array[swap] < array[child]) {
                // If the left child is greater than the parent, they need to
                // be swapped
                swap = child;
            }

            if (child + 1 <= end && array[swap] < array[child + 1]) {
                // If there is a right child though and it is greater than
                // the left child, then it should be the one to be swapped
                swap = child + 1;
            }

            if (swap == root) {
                // If the children are absent or less than the parent, then
                // this node is fine and no swaps need to be made
                return;
            }

            swap(array, root, swap);
            root = swap;
        }

    }

    private static int getParentIndex(int index) {
        return (int) Math.floor((index - 1) / 2);
    }


    private static int getLeftChild(int index) {
        return index * 2 + 1;
    }
}
