import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args){
        TreeMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("Fruit", "Apple");
        treeMap.put("Flower","Jasmine");
        treeMap.put("City", "Arlington");

        for(String i: treeMap.keySet()){
            System.out.println("Key: "+i+"\tValue: "+treeMap.get(i));
        }

        System.out.println("Key Set: "+treeMap.keySet());   //returns a set view of keys contained in the map
        System.out.println("Value Set: "+treeMap.values()); //returns a collection view of the values contained in the map
        System.out.println("Mapping Set: "+treeMap.entrySet()); //returns a mapping contained in this map
        System.out.println("Default Country: "+treeMap.getOrDefault("Country","USA")); //returns the value to which "weight" is mapped or defaultValue
    }    
}
