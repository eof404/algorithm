package ru.raishin.algorithm.sort;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * Class represent merge sort algorithm implementation with ForkJoin framework
 * for parallel sorting
 * 
 * @author raishin
 *
 */
public class ForkJoinMergeSort implements Sorter {

    public void sort(int[] a) {
        ForkJoinPool pool = new ForkJoinPool(2);
        pool.invoke(new MergeSortTask(a, 0, a.length - 1));
    }

    class MergeSortTask extends RecursiveAction {

        private static final long serialVersionUID = 7312836852891615280L;

        private int[] array;
        private int left, right;

        MergeSortTask(int[] array, int left, int right) {
            this.array = array;
            this.left = left;
            this.right = right;
        }

        @Override
        protected void compute() {
            if (right - left == 0) {
                return;
            }
            int mid = left + (right - left) / 2;
            invokeAll(new MergeSortTask(array, left, mid), new MergeSortTask(array, mid + 1, right));
            merge(array, left, mid, right);
        }
    }

    private int[] merge(int[] a, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];

        int i = 0;
        int l = left;
        int r = mid + 1;

        while (l <= mid && r <= right) {
            tmp[i++] = (a[l] < a[r]) ? a[l++] : a[r++];
        }
        int k, size;
        if (l <= mid) {
            k = l;
            size = mid;
        } else {
            k = r;
            size = right;
        }

        for (; k <= size; k++) {
            tmp[i++] = a[k];
        }

        for (i = 0; i < tmp.length; i++) {
            a[left + i] = tmp[i];
        }
        return a;
    }
}
