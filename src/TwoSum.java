import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,1,4,5,3,5,6,};
        int target=2;
        System.out.println(Arrays.toString(twoSum(arr,5)));
    }
    public static int[] twoSum(int[] arr,int target){
        int s=0,e=arr.length-1;
        while(s<e){
            int sum=arr[s]+arr[e];
            if(sum==target) return new int[]{arr[s],arr[e]};
            else if(sum<target) s++;
            else e--;
        }
        return new int[]{-1,-1};
    }
}
