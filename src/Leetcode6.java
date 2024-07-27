//Return the index numbers if the sum of two elements in the array ie equal to target,if not return -1

import java.util.Arrays;
public class Leetcode6 {
    public static void main(String[] args){
        int[] arr={2,4,5,6,7,8,9};
        int target=100;
        System.out.println(Arrays.toString(index(arr,target)));
    }
    static int[] index(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }
}
