//implements on the Arrays
import java.util.Arrays;
public class LearnArrayClass {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,11,22,25};
        int index =Arrays.binarySearch ( nums,4 );
        System.out.println ("Index of ele 4 in the array is : "+index);
        Arrays.sort ( nums );//Quick Sort
        //parallel sort //8192
        Arrays.fill ( nums,1 );
        System.out.println (Arrays.toString ( nums ));
    }
}
