package algorithm.sorting;

import java.util.Arrays;

public class MargeSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 9, 7, 8};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return mergeArrays(left, right);
    }

    static int[] mergeArrays(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] sortedArray = new int[right.length + left.length];
        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) sortedArray[k++] = right[j++];
            else sortedArray[k++] = left[i++];
        }
        while (i < left.length) sortedArray[k++] = left[i++];
        while (j < right.length) sortedArray[k++] = right[j++];
        return sortedArray;
    }
}
