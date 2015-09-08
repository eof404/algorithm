package ru.raishin.algorithm.sort;

import org.junit.Test;

/**
 * 
 * @author raishin
 *
 */
public class ForkJoinMergeSortTest extends SortTestBase {

    private ForkJoinMergeSort mergeSort;

    @Test
    public void sortTest() {
        mergeSort = new ForkJoinMergeSort();
        internalSortTest(mergeSort);
    }
}
