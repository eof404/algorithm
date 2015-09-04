package ru.raishin.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

import org.junit.Assert;
import org.junit.Before;

public abstract class SortTestBase {

	protected int arraySize = 10000;
	protected int[] array;
	protected int[] sortedArray;

	@Before
	public void populateArray() {
		array = new int[arraySize];
		Random random = new Random();
		for (int i = 0; i < arraySize; i++) {
			array[i] = random.nextInt(10);
		}
		sortedArray = Arrays.copyOf(array, array.length);
		Arrays.sort(sortedArray);
	}
	
	
	protected void internalSortTest(Sorter sorter){		
		sorter.sort(array);
		Assert.assertArrayEquals(sortedArray, array);
	}
}
