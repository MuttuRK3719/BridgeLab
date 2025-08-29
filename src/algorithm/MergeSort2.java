package algorithm.sorting;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 9, 7, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr){
        sort(arr,0,arr.length);
    }
    static void sort(int[]arr,int start,int end) {
        if (end - start == 1) return;
        int mid = start + (end - start) / 2;
        sort(arr, start, mid);
        sort(arr, mid, end);

        merge(arr, start, mid, end);
    }
    static void merge(int[]arr,int start,int mid,int end){
        int []mergeArr=new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid&&j<end){
            if(arr[i]<arr[j]){
                mergeArr[k]=arr[i];
                i++;
            }
            else {
                mergeArr[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mergeArr[k++]=arr[i++];
        }
        while(j<end){
            mergeArr[k++]=arr[j++];
        }
        for (int l = 0; l < mergeArr.length; l++) {
            arr[start+l]=mergeArr[l];
        }
    }
}

