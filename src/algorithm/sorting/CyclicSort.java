package algorithm.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 6, 3, 7};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int current = arr[i] - 1;
            if (arr[i] != arr[current]) {
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            } else i++;
        }
        return arr;

    }
}
