package generics;

/*
Constrains : you can use only a specific class from a specific group by extending the T to the particular parent class
Examples : Number.
Also, we can add attributes to the specific generic type, by implementing a particular interface.
For an extended class to be generic while using a particular interface. we have to implement that interface in the
class
*/
public class GenericList<T> { // T=type or template. E=element
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
