package task;
import java.util.*;
public class StringArray {
    public static void main(String args[])
    {
        String arr1[] = { "h", "i", "e", "f", "g" };
        String arr2[] = { "a", "b", "d", "c" };

        List list=new ArrayList(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));
        Object[] arr3 = list.toArray();
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));



    }
}