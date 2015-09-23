package ru.raishin.algorithm.sort;

import org.junit.Test;

/**
 * 
 * @author raishin
 *
 */
public class QuickSortTest extends SortTestBase {

    private QuickSort quickSort;

    @Test
    public void sortTest() {
        quickSort = new QuickSort();
        internalSortTest(quickSort);
    }

}
