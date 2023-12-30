import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
//      priority que implements queue so all functions of qurur will work
//        PriorityQueue<Integer> pq = new PriorityQueue<> (); // minheap
        PriorityQueue<Integer> pq = new PriorityQueue<> ( Comparator.reverseOrder () ); // maxheap

        pq.offer ( 42 );
        pq.offer ( 52 );
        pq.offer (12  );
        pq.offer ( 24 );
        pq.offer ( 48 );

        System.out.println (pq);
        pq.poll (); // remove prior elements
        System.out.println (pq);
        System.out.println (pq.peek ()); // will tell next ele which is to be remove
    }
}
