package generics;

//standard convention : all the utils are static
// Generic methods :
public class Utils {
    public static <T extends Comparable> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }

    //======================================================================================================================
//    Multiple type parameters:
    public static <K, V> void print(K key, V value) {
        System.out.println(key + "=" + value);
    }
    //    K = Key
//    V = Value;
//======================================================================================================================
//    Generic class and inheritance:
    public static void printUser(User user) {
        System.out.println(user);
    }

//    public static void printUsers(GenericList<User> users) {
//
//    }

    //======================================================================================================================
//        WildCards : the generic <?> = which is a unknown type yet

    //class CAP#1 extends User{}
    //class Instructor extends User{}

//    public static void printUsers(GenericList<? extends User> users) {
//        User x = users.get(0);
//        Instructor y = users.get(0); this is not possible; because it's a child.
//        users.add();
//    }

//    public static void printUsers(GenericList<? super User> users ){
//        GenericList<Object> temp = new GenericList<>();
//        users.add(new User(10));
//        users.add(new Instructor(120));
//        Object x = users.get(0); //it's the only way you can read a wildcard object, by calling the Object super class
//    }
}
//======================================================================================================================

