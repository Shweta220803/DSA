package HashSet;
import java.util.HashSet;
import java.util.Iterator;;

public class Hashing {
    public static void main(String[] args) {
        // creating
        HashSet<Integer> set = new HashSet<>();
        
        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        // size
        System.out.println("Size of set is : " + set.size());

        // print all elements of set
        System.out.println(set);

        //search
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }

        if(!set.contains(6)){
            System.out.println("Set does not contains 6");
        }

        // Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set does not contain 1, because we have deleted the sit");
        }


        // Iterator : Iterator has two functions -  next( it return next element) and hashNext(it return either true of false)
         Iterator it = set.iterator();
         while(it.hasNext()){
            System.out.println(it.next());
         }
        
        
    }
    
}
