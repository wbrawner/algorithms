package com.wbrawner.algorithms.searching;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedLinearSearchTest {

    @Parameterized.Parameter()
    public int[] array;

    @Parameterized.Parameter(1)
    public int searchFor;

    @Parameterized.Parameter(2)
    public int expectedIndex;

    @Test
    public void searchTest() {
        assertEquals(
                expectedIndex,
                LinearSearch.search(array, searchFor)
        );
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return SearchData.get();
    }
}