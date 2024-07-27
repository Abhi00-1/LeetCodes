//Return smallest letter greater than target ,if not present return 0th index letter
public class Leetcode5 {
    public static void main(String[] args) {
        char[] ch={'c','f','j'};
        char target='f';
        System.out.println(nextGreatestLetter(ch,target));

    }
    static char nextGreatestLetter(char[] letters,char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end) {
            int mid = (start + end) / 2;

              if (target < letters[mid]) {
                end = mid - 1;
              }
              else {
                start= mid + 1;
             }


        }
        return letters[start%letters.length];
    }
}
