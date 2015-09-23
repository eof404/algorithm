package ru.raishin.algorithm.sort;

/**
 * Class represent merge sort algorithm implementation
 * 
 * @author raishin
 *
 */
public class MergeSort implements Sorter {

    public void sort(int[] array) {
        array = mergeSort(array, 0, array.length - 1);
    }

    private int[] mergeSort(int[] a, int left, int right) {
        if (right - left == 0) {
            return a;
        }
        int mid = left + (right - left) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        return merge(a, left, mid, right);
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
