package ru.raishin.algorithm.sort;

import org.junit.Test;

/**
 * 
 * @author raishin
 *
 */
public class HeapSortTest extends SortTestBase {

    private HeapSort heapSort;

    @Test
    public void sortTest() {
        heapSort = new HeapSort();
        internalSortTest(heapSort);
    }
    
}
