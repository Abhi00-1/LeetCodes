// Find first and Last position of element in the sorted array
// It can be solved in two ways by brute force technique which takes O(n) time complexity.
// Another way is by applying binary search which takes O(logn) time complexity

public class Leetcode7 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,5,6,7,7,7,7,7,8};
        int[] ans=new int[arr.length];
        int target=7;
        ans[0]=search(arr,target,true);
        ans[1]=search(arr,target,false);
        System.out.println(ans[0]+" "+ans[1]);

    }
    static int search(int[] arr,int target,boolean findstartindex){
        int ans=-1;
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;

            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                ans=mid;
                if(findstartindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
