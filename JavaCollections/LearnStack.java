import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        //stack - LIFO ds
        //stack->push , pop , peek
        Stack<String > animals = new Stack<> ();
        animals.push ( "lion" );
        animals.push ( "dog" );
        animals.push ( "horse" );
        animals.push ( "cat" );

        System.out.println ("Stack:"+animals);
        animals.pop ();
        System.out.println ("stack:"+animals);
        System.out.println (animals.peek ());
//        System.out.println (animals.);
    }
}
