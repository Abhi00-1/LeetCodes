public class Stack<T> {
    private T[] arr;
    private int top;
    private int capacity;

    public Stack(int size){
        this.capacity=size;
        this.top=-1;
        this.arr= (T[]) new Object[capacity];
    }
    public Stack(){
        this.capacity=10;
        this.top=-1;
        this.arr= (T[]) new Object[capacity];
    }
    public void push(T value){
        if(top==capacity-1) throw new StackOverflowError("Stack is full");
        arr[++top]=value;

    }
    public T pop(){
        if(isEmpty()) throw new RuntimeException("Stack is empty");
        return arr[top--];
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public T peek(){
        if(isEmpty()) throw new RuntimeException("Stack is empty");
        return arr[top];
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(1);
        s.push(2);
        s.push(5);
        s.display();
        s.pop();
        s.display();
        System.out.println(s.peek());
    }
}
