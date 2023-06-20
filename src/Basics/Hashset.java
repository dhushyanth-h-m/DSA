import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Apollo 11"); //Adds the specified element to this set is not already present
        hashSet.add("Pioneer 1");
        hashSet.add("Apollo 8");

        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()); //prints the elements in the hashset
        }

        System.out.println("Size: "+hashSet.size()); //returns the number of elements in the hashset
        hashSet.remove("Pioneer 1"); //Deletes 'pioneer 1' from the hashset

        System.out.println("Containes Apollo 8: "+hashSet.contains("Apollo 8")); //returns true if the hashset contains 'Apollo 8'
        hashSet.clear(); //Empties the hashset
        
        iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()); //no output as the hashset is emtpy
        }
    }
}
