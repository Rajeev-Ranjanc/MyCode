import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer> ();
        list.add ( 12 );
        list.add ( 2 );
        list.add ( 35 );
        list.add ( 55 );
        list.add ( 85 );
        list.add ( 852 );
//        System.out.println ("minimum ele:"+ Collections.min ( list ));
//        System.out.println ("max. ele:"+ Collections.max ( list ));
//        System.out.println ("fre. of ele ele:"+ Collections.frequency ( list , 2 ));
//        Collections.sort ( list );
        Collections.sort ( list, Comparator.reverseOrder () );
        System.out.println (list);
    }
}
