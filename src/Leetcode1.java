// Return Maximum wealth
public class Leetcode1 {
    public static void main(String[] args) {
        int[][] arr={{1,10,45,75},{12,34,67,8},{1,2,3,4,5,6,7,8,9,10}};
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];

            }
            if(sum>ans){
                ans=sum;
            }
        }
        System.out.println(ans);
    }
}