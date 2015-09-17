package ru.raishin.algorithm.sort;

import org.junit.Test;

/**
 * 
 * @author raishin
 *
 */
public class CombSortTest extends SortTestBase {
    
    private CombSort combSort;

    @Test
    public void sortTest() {
        combSort = new CombSort();
        internalSortTest(combSort);
    }
}
