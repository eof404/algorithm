package ru.raishin.algorithm.sort;

/**
 * Odd-Event sort algorithm implementation
 * 
 * @author raishin
 *
 */
public class OddEvenSort implements Sorter {

    public void sort(int[] a) {
        boolean sorted = false;

        for (int iterationCount = 0, noSwapPassCount = 0; !sorted && noSwapPassCount != 2; iterationCount++) {
            sorted = true;
            noSwapPassCount++;
            for (int i = iterationCount % 2; i < a.length - 1; i += 2) {
                if (a[i] > a[i + 1]) {
                    ArrayUtils.swap(a, i, i + 1);
                    sorted = false;
                    noSwapPassCount = 0;
                }
            }
        }
    }
}
