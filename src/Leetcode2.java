//Number of even digit element in an array.
public class Leetcode2 {
    public static void main(String[] args) {
        int[] arr={12,1,234,2345,55};

        System.out.println(count(arr));
    }
   public static int count(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int digits=(int) Math.log10(arr[i])+1;
            if(digits%2==0){
                count+=1;
            }

        }
        return count;
    }
}
class example extends Leetcode2{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,55,6,6,7,897651};
        System.out.println(count(arr));
    }
}
