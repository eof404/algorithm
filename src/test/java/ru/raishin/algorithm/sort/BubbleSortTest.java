package ru.raishin.algorithm.sort;

import org.junit.Test;

/**
 * 
 * @author raishin
 *
 */
public class BubbleSortTest extends SortTestBase {

    private BubbleSort bubbleSort;

    @Test
    public void sortTest() {
        bubbleSort = new BubbleSort();
        internalSortTest(bubbleSort);
    }
}
