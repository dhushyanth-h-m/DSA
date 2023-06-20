import java.util.EmptyStackException;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isFull(){
        return top == maxSize-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
        }
        top++;
        stackArray[top] = value;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int poppedValue = stackArray[top];
        top--;
        return poppedValue;
    }

    public int size(){
        return top+1;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public static void main(String[] args){
        Stack stack = new Stack(5);
        
        stack.push(23);
        stack.push(56);
        stack.push(52);

        System.out.println("Top of the stack: "+stack.peek());
        System.out.println("Size of the stack: "+stack.size());

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}