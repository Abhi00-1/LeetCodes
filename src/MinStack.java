import java.util.Stack;

public  class MinStack {
     Stack<Integer> stack=new Stack<>();
      Stack<Integer> minStack=new Stack<>();

    public void push(int val){
        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
    }
    public void pop(){
        if(stack.pop().equals(minStack.peek()))
            minStack.pop();
    }
    public int top(){
        return stack.peek();
    }
    public  int getMin(){
        return minStack.peek();
    }
    public static void main(String[] args) {
    MinStack m=new MinStack();
    m.push(1);
        m.push(5);
        m.push(2);
        m.push(4);
        System.out.println(m.getMin());
        m.pop();




    }

}
