import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
    public static int[] removeDuplicates(int[] arr){
        int index=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[index]!=arr[i]) {
                index++;
                arr[index]=arr[i];
            }


        }
        return Arrays.copyOf(arr,index+1);
    }
}
