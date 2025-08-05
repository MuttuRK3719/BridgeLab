package LogicalDay2;

import java.util.Arrays;

public class FindSubArray {
    public static void main(String[] args) {
int []arr={1, 2, 3, 7, 5};
        System.out.println(Arrays.toString(getSubArray(arr,12)));
    }
    static int []getSubArray(int []arr,int sum){
        int subArraySum=0;
        int left=0;
        int i;
        for (i = 0; i < arr.length; i++) {
            subArraySum+=arr[i];
            while(subArraySum>sum){
                subArraySum-=arr[left++];
            }
            if(subArraySum==sum){
                break;
            }
        }
        int []result=new int[i-left+1];
        int k=0;
        for (int j = left; j <= i; j++) {
            result[k++]=arr[j];
        }
        return result;
    }
}
