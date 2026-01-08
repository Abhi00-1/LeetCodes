public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }
    public static boolean isValid(String s){
        Stack<Character> ch=new Stack<>(s.length());
       for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='[')
                ch.push(c);
            else{
                if(ch.isEmpty()) return false;
                char top=ch.pop();
                if((c==')' && top!='(')||(c=='}' && top!='{')||(c==']' && top!='['))
                    return false;
            }
        }
       return true;
    }
}
