//implements the properties of set as well as the linked list
//shows the order of the elements
import java.util.HashSet;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<> ();//Big O of N
        set.add ( 32 );
        set.add ( 2 );
        set.add ( 52 );
        set.add ( 42 );
        set.add ( 74 );

        System.out.println (set);

    }
}
