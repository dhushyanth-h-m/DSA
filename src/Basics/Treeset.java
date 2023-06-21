import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;

public class Treeset{
    public static void main(String[] args){
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(54);
        treeSet.add(21);
        treeSet.add(10);
        treeSet.add(43);

        System.out.print("TreeSet: ");
        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println("\nTreeset contains 21: "+treeSet.contains(21));

        System.out.print("Reverse order set: ");
        NavigableSet<Integer> navigableSet = treeSet.descendingSet();
        iterator = navigableSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        System.out.println("The first element in the set: "+treeSet.first());
        System.out.println("Greatest element in the set next to 25: "+navigableSet.floor(25));
        System.out.println("Least element in the set next to 25: "+navigableSet.ceiling(25));
        System.out.println("Last Highest element in the set: "+treeSet.last());
        System.out.println("Greatest element in the set Strictly less than 25: "+treeSet.lower(25));
    }
}