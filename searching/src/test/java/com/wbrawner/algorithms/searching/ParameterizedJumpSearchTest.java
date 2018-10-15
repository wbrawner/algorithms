package com.wbrawner.algorithms.searching;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assume.assumeTrue;

@RunWith(Parameterized.class)
public class ParameterizedJumpSearchTest {

    @Parameterized.Parameter()
    public int[] array;

    @Parameterized.Parameter(1)
    public int searchFor;

    @Parameterized.Parameter(2)
    public int expectedIndex;

    @Parameterized.Parameter(3)
    public boolean isSorted;

    @Test
    public void searchTest() {
        // The array needs to be sorted for binary search to work.
        assumeTrue(isSorted);

        assertEquals(
                expectedIndex,
                JumpSearch.search(array, searchFor)
        );
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return SearchData.get();
    }
}