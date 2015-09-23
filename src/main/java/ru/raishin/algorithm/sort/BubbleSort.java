package ru.raishin.algorithm.sort;

/**
 * Bubble sort algorithm implementation
 * 
 * @author raishin
 *
 */
public class BubbleSort implements Sorter {

    public void sort(int[] array) {
        boolean sorted = false;
        for (int iterationCount = 0; !sorted; iterationCount++) {
            sorted = true;
            for (int i = 0; i < array.length - iterationCount - 1; i++) {
                if (array[i] > array[i + 1]) {
                    ArrayUtils.swap(array, i, i + 1);
                    sorted = false;
                }
            }
        }
    }
}
