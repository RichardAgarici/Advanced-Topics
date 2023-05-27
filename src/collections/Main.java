package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        var list = new GenericList<String>();
//        var iterator = list.iterator();
//// [a, b, c]
//
////        while (iterator.hasNext()) {
////            var current = iterator.next();
////            System.out.println(current);
////        }
//        for (var item : list)
//            System.out.println(item);
//    }
//======================================================================================================================
//        var list = new GenericList<String>();
//        list.add("a");
//        list.add("b");
//        for (var item: list) {
//            System.out.println(item);
//        }
//======================================================================================================================
//        Collection Interface:
        CollectionsDemo.show();
//======================================================================================================================
//        List Interface:
        ListDemo.show();
//======================================================================================================================
//        The Comparable Interface:
//        List<Customer> customers = new ArrayList<>();
//        customers.add(new Customer("b", email));
//        customers.add(new Customer("a", email));
//        customers.add(new Customer("c", email));
//        Collections.sort(customers);
//        System.out.println(customers);
//======================================================================================================================
//        The ComparaTOR interface:
//        List<Customer> customers = new ArrayList<>();
//        customers.add(new Customer("b", "e3"));
//        customers.add(new Customer("a", "e2"));
//        customers.add(new Customer("c", "e1"));
//        Collections.sort(customers, new EmailComparator()); // sort() has 2 methods. 1 normal sorting, 1 with a ComparaTOR class object
//        System.out.println(customers);
//======================================================================================================================
//        The Queue interface:
//        QueueDemo.show();
//======================================================================================================================
//        The Set Interface:
//        SetDemo.show();
//======================================================================================================================
//        The Map interface:
        MapDemo.show();
//======================================================================================================================
    }
}
