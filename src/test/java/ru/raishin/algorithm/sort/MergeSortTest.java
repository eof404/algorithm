package ru.raishin.algorithm.sort;

import org.junit.Test;

public class MergeSortTest extends SortTestBase {

    private MergeSort mergeSort;

    @Test
    public void sortTest() {
        mergeSort = new MergeSort();
        internalSortTest(mergeSort);
    }

}
