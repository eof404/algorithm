package ru.raishin.algorithm.sort;

/**
 * Class represent selection sort algorithm implementation
 * 
 * @author raishin
 */
public class SelectionSort implements Sorter {

    public void sort(int[] array) {
        int minIdx;
        for (int i = 0; i < array.length; i++) {
            minIdx = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            if (i != minIdx) {
                ArrayUtils.swap(array, i, minIdx);
            }
        }
    }
}
