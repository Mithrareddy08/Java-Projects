package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Traverse {

    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.addAll(Arrays.asList("Python", "Java", "Devops"));
        System.out.println("Using For Loop:");
        for (int i = 0; i < arr.size(); i++) {  // using for loop
            String a = arr.get(i);
            System.out.println(a);
        }
        System.out.println("Using Enhanced Loop:");
        for (String a : arr)  // using enhanced loop
        {
            System.out.println(a);
        }
        arr.add("DOt net");
        System.out.println("Using Iterator:");
        Iterator<String> itr =arr.iterator();
        while (itr.hasNext())
            System.out.println(itr.next() + " ");

        int length = arr.size();
        arr.remove(length - 1);

        System.out.println("Using ForEach loop:"); // Using Foreach Loop
        arr.forEach((n) -> System.out.println(n));

        System.out.println(" Using Parallel Stream:"); // Using Parallel Stream
        arr.parallelStream().forEach(element ->
            System.out.println(element));

    }
}
