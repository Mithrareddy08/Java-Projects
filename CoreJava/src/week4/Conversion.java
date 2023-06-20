package Week4;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversion {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.addAll(Arrays.asList("Python","Java","Devops"));
        System.out.println("Printing from an ArrayList:");
        for ( String a:arr) {
            System.out.println(a);
        }
        int len=arr.size();
        String[] array = new String[len];
        System.out.println("Printing from an Array:");
        array = arr.toArray(array);
        for (String a: arr)
        {
            System.out.println(a);
        }


    }
}