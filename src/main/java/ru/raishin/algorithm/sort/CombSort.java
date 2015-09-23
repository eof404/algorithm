package ru.raishin.algorithm.sort;

/**
 * Comb sort algorithm implementation
 * 
 * @author raishin
 *
 */
public class CombSort implements Sorter {

    /**
     * shrink factor
     * 
     */
    private static float JUMP = (float) 1.247;

    public void sort(int[] array) {
        int step = (int) ((array.length - 1) / JUMP);
        boolean sorted = false;
        while (!sorted && step >= 1) {
            sorted = true;
            step = (int) (step / JUMP);
            for (int i = 0; i < array.length - step; i++) {
                if (array[i] > array[i + step]) {
                    ArrayUtils.swap(array, i, i + step);
                    sorted = false;
                }
            }
        }
    }
}
