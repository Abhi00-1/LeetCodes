public class ReverseString {
    public static void main(String[] args) {
        reverse("abhi");
    }
    public static void reverse(String s){

        char[] c=s.toCharArray();
        int f=0,l=s.length()-1;
        while(f<l){
           char temp=c[f] ;
           c[f]=c[l];
           c[l]=temp;
           f++;
           l--;
        }
        System.out.println(new String(c));
    }

}
