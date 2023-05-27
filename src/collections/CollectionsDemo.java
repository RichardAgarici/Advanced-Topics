package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
//        for (var item : collection)
//            System.out.println(item);
//        System.out.println(collection);
//======================================================================================================================
//        the same result but using Collections.addAll. basically it modifies the first argument via a static method.
        Collections.addAll(collection, "a", "b", "c");// ... means 0 or more arguments
//        System.out.println(collection);
//        System.out.println(collection.size()); // obviously the size of number of indexes

//        collection.remove("a"); // deletes the specific argument. or index (overloaded)
//        System.out.println(collection);

//        collection.clear(); // deletes all
//        System.out.println(collection.isEmpty()); // boolean which checks if the collection is empty or not.

//        var containsA = collection.contains("a");
//        System.out.println(containsA);  //boolean which determines if it contains specific element.

//        Object[] arr = collection.toArray();
//        var stringArray = collection.toArray(new String[3]);
//        var stringArray = collection.toArray(new String[0]); // calling an array with will make its own container without worrying about the counting.
        // here we can use ALL THE STRING methods. Only in the situation of a String[].

//        Collection<String> other = new ArrayList<>();
//        other.addAll(collection); // this is one variant but not clean code

//        Collection<String> other = new ArrayList<>(collection); // this is clean code since the ArrayList can accept another list as a parameter

//        System.out.println(collection == other); // == compares the Hash. the address. since we used the new operator.
//        System.out.println(collection.equals(other)); // equals() is for checking if the collections are equal by content.
//======================================================================================================================
//        The List Interface:

//======================================================================================================================
    }
}
