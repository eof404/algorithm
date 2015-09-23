package ru.raishin.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

import org.junit.Assert;
import org.junit.Before;

/**
 * 
 * @author raishin
 *
 */
public abstract class SortTestBase {

    protected int arraySize = 1000;
    protected int[] sourceArray;
    protected int[] sortedArray;

    @Before
    public void populateArray() {
        sourceArray = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            sourceArray[i] = random.nextInt(arraySize);
        }
        sortedArray = Arrays.copyOf(sourceArray, sourceArray.length);
        Arrays.sort(sortedArray);
    }

    protected void internalSortTest(Sorter sorter) {
        int[] arrayToSort = Arrays.copyOf(sourceArray, sourceArray.length);
        sorter.sort(arrayToSort);
        Assert.assertArrayEquals(sortedArray, arrayToSort);
    }
}
