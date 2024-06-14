package HashMap;

import java.util.HashMap;;
public class Hashing {
    public static void main(String[] args) {
        // country(key), population(value)
        HashMap<String, Integer>  map = new HashMap<>();

        // Insert(key-value)
        map.put("India",120) ;// puts means add karna
        map.put("US",90 );
        map.put("China", 80);

        // print 
        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);


        // search or lookup
        if(map.containsKey("China")){
            System.out.println("Keyis  Present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }


        // get function
        System.out.println(map.get("China")); // key exist
        System.out.println(map.get("Indonesia")); // Key not exist

    }
    
}
