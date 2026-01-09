import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    public static int[] twoSum2(int[] arr,int target){
        Map<Integer,Integer> m=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement=target-arr[i];
            if(m.containsKey(complement)){
                return new int[]{m.get(complement),i};
            }
            m.put(arr[i],i);

        }
        return new int[]{-1,-1};
    }
}
