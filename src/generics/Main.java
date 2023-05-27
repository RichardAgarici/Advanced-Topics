package generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        var list = new GenericList<Integer>();
//        list.add(1);
//        int number = list.get(0);
//======================================================================================================================
//        var list = new GenericList<User>();
//        list.add(new User());
//        User user=list.get(0);
//======================================================================================================================
        /*
        for every primitive type there is a wrapper class. For example :
        int -> Integer.
        float -> Float.
        boolean -> Boolean.
        etc.
        these are reference types which hold a primitive type in them.
         */
//        GenericList<Integer> numbers = new GenericList<>();
//        numbers.add(1); // this is called boxing
//        int number = numbers.get(0); // this is called unboxing
//======================================================================================================================
// Constrains :
//        new GenericList<User>();
//======================================================================================================================
//        Comparable interface :
//        var user1 = new User(10);
//        var user2 = new User(20);
//        if (user1.compareTo(user2) < 0 )
//            System.out.println("user1 < user2");
//        else if (user1.compareTo(user2) == 0)
//            System.out.println("user1 = user 2");
//        else
//            System.out.println("user1 > user2");
//======================================================================================================================
//        Generic methods:

//        var max = Utils.max(1, 3);
//        System.out.println(max);

//        var max =Utils.max(new User(10), new User(20));
//        System.out.println(max);

//======================================================================================================================
//        Multiple Type Parameter methods:
//        Utils.print(1, " ASA");
//======================================================================================================================
//        Generic class and inheritance
//        User user = new Instructor(10);
//        Utils.printUser(new Instructor(10));
//        var users = new GenericList<User>();
//        Utils.printUsers(users);

//        var instructors= new GenericList<Instructor>();
//        var users = new GenericList<User>();
//        Utils.printUsers(instructors);    // this will not work because we made the method specifically for User.
//        so Instructor is the child. the only way it's working is if we use for each from the Instructor list and
//        pass it to a new generic list of Users to be able to use the generic method.
//======================================================================================================================
//        WildCards :
        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();
//        Utils.printUsers(new GenericList<>()); // BOTH ARE VALID
//        Utils.printUsers(new GenericList<Instructor>());

//======================================================================================================================
    }
}
