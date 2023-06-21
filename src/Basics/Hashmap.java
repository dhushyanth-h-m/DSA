import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args){
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("Score",94); 
        hashMap.put("Age",21);
        hashMap.put("Height", 6);
        
        System.out.println("Key Set: "+hashMap.keySet());   //returns a set view of keys contained in the map
        System.out.println("Value Set: "+hashMap.values()); //returns a collection view of the values contained in the map
        System.out.println("Mapping Set: "+hashMap.entrySet()); //returns a mapping contained in this map
        System.out.println("Default weight: "+hashMap.getOrDefault("Weight", 135)); //returns the value to which "weight" is mapped or defaultValue
        
        for(String i: hashMap.keySet()){ //keySet()
            System.out.println("Key: "+i+"\tValue: "+hashMap.get(i)); //printing all the keys and their corresponding values
        }
        
        hashMap.remove("Height");
        System.out.println("Updated Key Set: "+hashMap.keySet());   //returns a set view of keys contained in the map

    }    
}
