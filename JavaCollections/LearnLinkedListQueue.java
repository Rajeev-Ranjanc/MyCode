import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<> ();
        queue.offer ( 12 ); //adding elements
        queue.offer ( 24 );
        queue.offer ( 36 );
        queue.offer ( 38 );
        System.out.println (queue);
        System.out.println (queue.poll ()); // remove first elements
        System.out.println (queue);

        System.out.println (queue.peek ()); // next ele. which is gonna pop
    }

}
