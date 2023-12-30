import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        //we can add/remove elements from both sides
        //from ADQ we can implement queue ans stack(would be)
        ArrayDeque<Integer> adq = new ArrayDeque<> ();
        adq.offer ( 12);
        adq.offerFirst ( 24 );
        adq.offerLast ( 45 );
        adq.offer ( 100 ); //offer add ele at the last
        System.out.println (adq);

//        System.out.println (adq.peek ());//peek->next in line(nikalne wala)
//        System.out.println (adq.peekFirst ());
//        System.out.println (adq.peekLast ());

        System.out.println (adq.poll()); //remove prior(first) elements
        System.out.println ("poll()->"+adq);
        System.out.println (adq.pollFirst ());
        System.out.println ("pollfirst()->"+adq);
        System.out.println (adq.pollLast ());
        System.out.println ("polllast()->"+adq);
        System.out.println (adq);
    }
}
