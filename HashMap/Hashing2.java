package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Hashing2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
       
        // Insert(key-value)
        map.put("India",120) ;// puts means add karna
        map.put("US",90 );
        map.put("China", 80);
        

        // Method - 01 to print key-value
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());

        }

        // Method - 02 to print key-value
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
        System.out.println();


        // remove any pair in map
        map.remove("China");
        System.out.println(map);

    }
    
}
