public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("abhi","ibhs"));
    }
    public static boolean isAnagram(String s,String s1){
        if(s.length()!=s1.length()) return false;
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[s1.charAt(i)-'a']--;
        }
      for(int n:count){
          if(n!=0) return false;
      }
      return true;
    }
}
