package ru.raishin.algorithm.sort;


/**
 * Class represent quick sort algorithm implementation
 * 
 * @author raishin
 *
 */
public class QuickSort implements Sorter {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    /**
     * Sort subarray of a using quick sort algorithm
     * 
     * @param a
     *            - array for sort
     * @param left
     *            - index of first element
     * @param right
     *            - index of last element
     */
    private void quickSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int midIdx = left + (right - left) / 2;
        int l = left;
        int r = right;

        while (l < r) {
            while (l < midIdx && a[l] <= a[midIdx]) {
                l++;
            }
            while (r > midIdx && a[r] >= a[midIdx]) {
                r--;
            }
            if (l <= r) {
                ArrayUtils.swap(a, l, r);
                if (l == midIdx) {
                    midIdx = r;
                } else if (r == midIdx) {
                    midIdx = l;
                }
            }
        }
        quickSort(a, left, midIdx);
        quickSort(a, midIdx + 1, right);
    }
}
