public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
    }
    public static boolean isPalindrome(String s){
        int f =0,l= s.length()-1;
        while(f<l){
            if(s.charAt(f)!=s.charAt(l)) return false;
            f++;
            l--;
        }
        return true;
    }
}
