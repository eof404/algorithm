package ru.raishin.algorithm.sort;

import org.junit.Test;

/**
 * 
 * @author raishin
 *
 */
public class SelectionSortTest extends SortTestBase {

    private SelectionSort selectionSort;

    @Test
    public void selectionSortTest() {
        selectionSort = new SelectionSort();
        internalSortTest(selectionSort);
    }
}
