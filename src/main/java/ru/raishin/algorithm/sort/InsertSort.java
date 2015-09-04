package ru.raishin.algorithm.sort;

/**
 * Class represent insert sort algorithm implementation
 * 
 * @author raishin
 *
 */
public class InsertSort implements Sorter {

    public void sort(int[] source) {
        for (int i = 1; i < source.length; i++) {
            for (int j = i; j > 0 && source[j - 1] > source[j]; j--)
                ArrayUtils.swap(source, j - 1, j);
        }
    }    

}
