package ru.raishin.algorithm.sort;

import org.junit.Test;

public class ShakeSortTest extends SortTestBase {

    private ShakeSort shakeSort;

    @Test
    public void sortTest() {
        shakeSort = new ShakeSort();
        internalSortTest(shakeSort);
    }
}
