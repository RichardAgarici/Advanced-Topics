package generics;

public class Instructor extends User{
    public Instructor(int points) {
        super(points);
    }
//    In order for instructor to inherit the User class, we have to specifically call the constructor using the super()
//    any child class will inherit the behaviour of the parent class + it can add more specifications.
//    it´s dependent of one another
}
