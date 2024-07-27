//ceiling of the given number
//---Logic for both Acending and Decdending sorted array---
//---largest smaller number greater than or equal to target---

public class Leetcode3 {
    public static void main(String[] args) {
        int[] acen ={1,3,5,7,8,9,11,34};
        int[] dcen={10,8,7,5,2,1};
        int target=10;
        System.out.println(ceiling(acen,target));
        System.out.println(ceiling(dcen,target));
    }
    static int ceiling(int[] arr,int target){
        if(arr[arr.length-1]>arr[0]){
            if(target>arr[arr.length-1]){
                return -1;
            }
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==target)
                    return arr[mid];
                else if (target>arr[mid]) {
                    start=mid+1;

                }
                else
                    end=mid-1;

            }
            return arr[start];
        }
        else{
            if(target<arr[0]){
                return -1;
            }
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==target)
                    return arr[mid];
                else if (target>arr[mid]) {
                    end=mid-1;

                }
                else
                    start=mid+1;

            }
            return arr[start];

    }
}
}
