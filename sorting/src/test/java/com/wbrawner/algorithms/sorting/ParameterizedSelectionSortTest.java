package com.wbrawner.algorithms.sorting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class ParameterizedSelectionSortTest {


    @Parameterized.Parameter(1)
    public int[] sorted;

    @Parameterized.Parameter()
    public int[] unsorted;

    @Test
    public void sortTest() {
        assertArrayEquals(
                sorted,
                SelectionSort.sort(unsorted)
        );
    }

    @Parameterized.Parameters
    public static int[][][] getData() {
        return SortData.get();
    }
}