import java.util.TreeMap;
import java.util.Map;

//Tree maps are sorted on the keys
public class LearnTreeMaps {
    public static void main(String[] args) {
        Map<String , Integer> numbers = new TreeMap<> ();
        numbers.put ( "one", 1 );
        numbers.put ( "Two", 2 );
        numbers.put ( "Three", 3 );
        numbers.put ( "Four", 4 );
        numbers.put ( "Five", 5 );
        System.out.println (numbers);

        numbers.remove ( "Three" );
        System.out.println (numbers);
    }
}
