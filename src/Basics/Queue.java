import  java.util.EmptyStackException;

public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public boolean isFull(){
        return currentSize == maxSize;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full!.");
            return;
        }
        rear += 1;
        currentSize += 1;
        queueArray[rear] = value;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new EmptyStackException();
            // return 0;
        }
        int dequeuedValue = queueArray[front];
        if(front == rear){
            front = rear = -1;
        }
        front += 1;
        currentSize -= 1;
        return dequeuedValue;
    }

    public int size(){
        return currentSize;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return queueArray[front];
    }

    public static void main(String[] args){
        Queue queue = new Queue(4);

        queue.enqueue(234);
        queue.enqueue(184);
        queue.enqueue(693);
        queue.enqueue(952);

        System.out.println("Size: "+queue.size());
        System.out.println("Front: "+queue.peek());
        
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
