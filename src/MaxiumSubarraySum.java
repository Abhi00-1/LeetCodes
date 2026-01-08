import java.util.Arrays;

public class MaxiumSubarraySum {
    public static void main(String[] args) {
        int[] arr={1,3,-1,2,4,0,6};
        System.out.println(maxSum(arr));

    }
    public static int maxSum(int[] arr){
        int maxSum=arr[0],currSum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(currSum,maxSum);

        }
        return maxSum;
    }
}
