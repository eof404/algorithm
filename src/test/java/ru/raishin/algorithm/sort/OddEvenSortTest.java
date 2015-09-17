package ru.raishin.algorithm.sort;

import org.junit.Test;

/**
 * 
 * @author raishin
 *
 */
public class OddEvenSortTest extends SortTestBase {

    private OddEvenSort oddEvenSort;

    @Test
    public void sortTest() {
        oddEvenSort = new OddEvenSort();
        internalSortTest(oddEvenSort);
    }
}
