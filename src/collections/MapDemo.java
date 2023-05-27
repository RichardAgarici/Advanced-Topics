package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void show() {
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

//        var customer = map.get("e1");
//        System.out.println(customer);

//        var customer1 = map.get("e10"); //this will return null.
//        System.out.println(customer1);

//        var unknownCustomer = new Customer("unknown","");
//        var customer = map.getOrDefault("e10", unknownCustomer );
        // search for "e10", if you can't find it, return the object unknownCustomer
//        System.out.println(customer);

//        var exists = map.containsKey("e10");
//        .containsKey() is a boolean function which is called whenever we enter a specific value.
//        System.out.println(exists);

//        System.out.println(map);
//        map.replace("e1", new Customer("a++","e1"));
//        System.out.println(map);

        for (var key : map.keySet())
            System.out.println(key);
        for (var entry : map.entrySet())
            System.out.println(entry);
        for (var customer : map.values())
            System.out.println(customer);
//        Since the Map interface doesn't have an Iterable implementation we cannot use normal for-each

//        We need to use the map.keySet() which return a HashSet which is implemented from Iterable.
//        .entrySet() return a Set of key=value;
//        .values() returns the values only
//        since they all return a Set, the order may not be guaranteed


    }
}
