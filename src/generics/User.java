package generics;

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }


    //======================================================================================================================
    @Override
    public int compareTo(User other) {
        return points - other.points;

//        ^
//        = this is basically this if statement

//        if (points < other.points)
//            return -1;
//        if (points == other.points)
//            return 0;
//        return -1;
    }
    @Override
    public String toString() {
        return "Points = "+ points;
    }
// ======================================================================================================================
}

