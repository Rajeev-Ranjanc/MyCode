import java.util.HashSet;
import java.util.Set;
//follows property of set ->don't allow duplicate elements
public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<> ();
        set.add ( 32 );
        set.add ( 2 );
        set.add ( 52 );
        set.add ( 42 );
        set.add ( 74 );

        System.out.println (set);
        set.remove ( 2 );
        System.out.println (set.contains ( 100 ));
        System.out.println (set);
        System.out.println (set.isEmpty ());
        System.out.println (set.size ());
        System.out.println (set);
        set.clear ();
        System.out.println (set);
    }
}
