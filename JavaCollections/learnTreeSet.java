import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
//holds properties of setv as well tree(always sorted themselves)
public class learnTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<> ();
        set.add ( 32 );
        set.add ( 2 );
        set.add ( 52 );
        set.add ( 42 );
        set.add ( 74 );

        System.out.println (set);
    }
}
