package ru.raishin.algorithm.sort;

/**
 * Odd-Event sort algorithm implementation
 * 
 * @author raishin
 *
 */
public class OddEvenSort implements Sorter {

    public void sort(int[] array) {
        boolean sorted = false;

        for (int iterationCount = 0, noSwapPassCount = 0; !sorted && noSwapPassCount != 2; iterationCount++) {
            sorted = true;
            noSwapPassCount++;
            for (int i = iterationCount % 2; i < array.length - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    ArrayUtils.swap(array, i, i + 1);
                    sorted = false;
                    noSwapPassCount = 0;
                }
            }
        }
    }
}
