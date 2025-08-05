package LogicalDay2;

public class SecondHighest {
    public static void main(String[] args) {
        int []arr={3, 1, 4, 4, 5, 5, 2};
        System.out.println(secondHighest(arr));
    }
    static int secondHighest(int []arr){
        int firstBig=Integer.MIN_VALUE;
        int secondBig=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
        if(arr[i]>firstBig){
            secondBig=firstBig;
            firstBig=arr[i];
        }
        else if(arr[i]>secondBig && arr[i]<firstBig){
            secondBig=arr[i];
        }
        }
        return secondBig;
    }
}
