//floor of the given number
//---Logic for both Acending and Decdending sorted array---
//--- smallest larger number less than are equal to target---
public class Leetcode4 {
    public static void main(String[] args) {
        int[] acen ={1,2,3,12,45,56,67,90};
        int[] dcen={10,8,6,4,2,1};
        int target=4;
        System.out.println(floor(acen,target));
        System.out.println(floor(dcen,target));

    }
    static int floor(int[] arr,int target){
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
            if(target<arr[arr.length-1]){
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

