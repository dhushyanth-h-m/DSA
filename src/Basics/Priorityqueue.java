import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.ArrayList;add

public class Priorityqueue {
    public static void main(String[] args){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        ArrayList<Integer> priorityArray = new ArrayList<>();

        priorityQueue.add(34);
        priorityQueue.add(12);
        priorityQueue.add(57);
        priorityQueue.add(24);

        Iterator<Integer> iterator = priorityQueue.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        System.out.println("First Element in the queue: "+priorityQueue.peek());
        System.out.println("Size of the queue: "+priorityQueue.size());
        System.out.println("Queue as an array: "+priorityQueue.toArray(new Integer[0]));
    }    
}
