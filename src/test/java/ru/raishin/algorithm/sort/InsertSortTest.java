package ru.raishin.algorithm.sort;

import org.junit.Test;

public class InsertSortTest extends SortTestBase {

    private InsertSort insertSort;

    @Test
    public void sortTest() {
        insertSort = new InsertSort();
        internalSortTest(insertSort);
    }
}
