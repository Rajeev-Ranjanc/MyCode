import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArraylist {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<> ();
        List<Integer> list = new ArrayList<> ();
        //size -> n
        //       n + n/2+1
    //add elements at the end of the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(45);
        list.add(1 , 252);
        System.out.println (list);

        //iterate into list
//        for loop
        for (int i = 0; i < list.size (); i++) {
            System.out.println ("the element:"+list.get(i));
        }

        //for each loop
        for(int elements : list){
            System.out.println ("for each ele: "+elements);
        }

        //iterator
        Iterator<Integer> it = list.iterator ();
        while (it.hasNext ()){
            System.out.println ("Iterator:"+it.next ());
        }


//        ArrayList<Integer> newlist = new ArrayList<> ();
//        newlist.add ( 150 );
//        newlist.add ( 152 );
//        list.addAll ( newlist );
//        System.out.println (list);

//        System.out.println (list.get(1));
//        list.remove ( 1 );
//        list.remove ( Integer.valueOf ( 4 ) );
//        list.clear ();

//        list.set ( 2 , 1000 );
//        System.out.println (list.contains ( 50 ));
//        System.out.println (list);

    }
}
