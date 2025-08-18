package algorithm.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 9, 7, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = getPivot(arr, start, end);
            sort(arr, start, pivotIndex - 1);
            sort(arr, pivotIndex + 1, end);
        }
    }

    static int getPivot(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start
             ; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}
