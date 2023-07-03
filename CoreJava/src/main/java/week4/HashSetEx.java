package week4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String args[]) {
        HashSet<String> h = new HashSet<>();
        h.addAll(Arrays.asList("Mithra", "Rash", "Sanjana", "Roshini", "Rishika", "Sneha", "Priya", "Sahithi"));
        System.out.println("Using Iterator");
        System.out.println("-----****----");
        Iterator<String> i = h.iterator(); // Using Iterator
        while (i.hasNext())
            System.out.println(i.next());
        System.out.println(" ");
        System.out.println("--------------*******------------");
        System.out.println("Using  ForEach");
        h.forEach(k -> {System.out.print(k + " ");
        });
        System.out.println(" ");
        System.out.println("--------------*******------------");
        System.out.println("Using Streams ForEach");
        h.stream().forEach(x -> System.out.print(x+" "));

    }

}
