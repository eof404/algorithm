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

    public void sort(int[] a) {
        int step = (int) ((a.length - 1) / JUMP);
        boolean sorted = false;
        while (!sorted && step >= 1) {
            sorted = true;
            step = (int) (step / JUMP);
            for (int i = 0; i < a.length - step; i++) {
                if (a[i] > a[i + step]) {
                    ArrayUtils.swap(a, i, i + step);
                    sorted = false;
                }
            }
        }
    }
}
