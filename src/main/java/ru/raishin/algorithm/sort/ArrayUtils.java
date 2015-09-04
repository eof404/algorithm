package ru.raishin.algorithm.sort;

public class ArrayUtils {

	/**
	 * Swap two elements of array
	 * 
	 * @param arr
	 *            - array
	 * @param i
	 *            - index of first element
	 * @param j
	 *            - index of second element
	 */
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}
