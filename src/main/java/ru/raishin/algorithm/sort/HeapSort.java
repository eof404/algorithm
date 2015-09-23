package ru.raishin.algorithm.sort;

/**
 * Heap sort algorithm implementation
 * 
 * @author raishin
 *
 */
public class HeapSort implements Sorter {

    private int heapSize;

    public void sort(int[] array) {
        heapSize = array.length - 1;
        buildHeap(array);

        for (int i = array.length - 1; i > 0; i--) {
            ArrayUtils.swap(array, i, 0);
            heapSize--;
            heapify(array, 0);
        }

    }

    private void buildHeap(int[] a) {
        for (int i = (a.length - 1) / 2; i >= 0; i--) {
            heapify(a, i);
        }
    }

    /**
     * a[parent]>=a[child]
     * 
     * @param a
     * @param i
     */
    private void heapify(int[] a, int i) {
        int parent = i;
        int leftChild = 2 * i;
        int rightChild = 2 * i + 1;

        if (leftChild <= heapSize && a[leftChild] > a[parent]) {
            parent = leftChild;
        }
        if (rightChild <= heapSize && a[rightChild] > a[parent]) {
            parent = rightChild;
        }
        if (i != parent) {
            ArrayUtils.swap(a, i, parent);
            heapify(a, parent);
        }
    }
}
