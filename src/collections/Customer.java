package collections;

/* Comparable Interface
this comparable will ONLY work if there is an implementation of the Comparable interface in the specific class we are using.
for example if we want to make a customer comparable, we will need to specifically tell java, because he won't assume it.
 */

public class Customer implements Comparable<Customer> {
    private String name;


    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Customer other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
    public String getEmail() {
        return email;
    }
}
//public class Customer implements Comparable<Customer> {
//    private String name;
//
//    public Customer(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public int compareTo(Customer other) {
//        return name.compareTo(other.name);
//    }
//
//    @Override
//    public String toString() {
//        return name;
//    }
