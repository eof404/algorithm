package ru.raishin.algorithm.sort;

/**
 * Shake sort algorithm implementation
 * 
 * @author raishin
 *
 */
public class ShakeSort implements Sorter {

    public void sort(int[] a) {
        boolean sorted = false;
        for (int iterationCount = 0; !sorted; iterationCount++) {
            sorted = true;
            for (int i = 0; i < a.length - iterationCount - 1; i++) {
                if (a[i] > a[i + 1]) {
                    ArrayUtils.swap(a, i, i + 1);
                }
            }
            for (int i = a.length - iterationCount - 1; i > iterationCount; i--) {
                if (a[i] < a[i - 1]) {
                    ArrayUtils.swap(a, i, i - 1);
                    sorted = false;
                }
            }
        }
    }
}