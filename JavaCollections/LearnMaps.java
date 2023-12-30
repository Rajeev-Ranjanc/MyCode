//upgrade the prev. data
import java.util.HashMap;
import java.util.Map;
public class LearnMaps {
    public static void main(String[] args) {
        Map<String , Integer> numbers = new HashMap<> ();
        numbers.put ( "one", 1 );
        numbers.put ( "Two", 2 );
        numbers.put ( "Three", 3 );
        numbers.put ( "Four", 4 );
        numbers.put ( "Five", 5 );
//        numbers.put ( "Two", 23);
//    if(!numbers.containsKey ( "Two" )){
//    numbers.put ( "two", 23 ); //it will override while ifabsent fun. don't to do so
//    }
//    numbers.putIfAbsent ( "Two", 23);
//        System.out.println (numbers);

        //iterate
//        for(Map.Entry<String , Integer> e: numbers.entrySet ()){
//            System.out.println (e);
//            System.out.println (e.getKey ());
//            System.out.println (e.getValue ());
//        }
//        System.out.println (numbers.keySet ());

        System.out.println (numbers.containsValue ( "Three" ));
        System.out.println (numbers.isEmpty ());
    }
}
