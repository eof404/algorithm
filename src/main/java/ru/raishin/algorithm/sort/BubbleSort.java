package ru.raishin.algorithm.sort;

/**
 * Bubble sort algorithm implementation
 * 
 * @author raishin
 *
 */
public class BubbleSort implements Sorter {

    public void sort(int[] a) {
        boolean sorted = false;
        for (int iterationCount = 0; !sorted; iterationCount++) {
            sorted = true;
            for (int i = 0; i < a.length - iterationCount - 1; i++) {
                if (a[i] > a[i + 1]) {
                    ArrayUtils.swap(a, i, i + 1);
                    sorted = false;
                }
            }
        }
    }
}
