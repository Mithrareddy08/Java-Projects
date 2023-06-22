package week4;
import java.util.*;

public class HashMapStu {
    public static void main(String[] args) {
        Map<String, StudentLi> map = new HashMap<>();
        map.put("Mithra", new StudentLi("Mithra", "Reddy", 3.8));
        map.put("Rash", new StudentLi("Rash", "Reddy", 3.9));
        map.put("Sanjana", new StudentLi("Sanjana", "Reddy", 3.7));
        map.put("Rishika", new StudentLi("Rishika", "Cheruku", 4.0));
        map.put("Roshini", new StudentLi("Roshini", "Racha", 3.5));
        map.put("Priya", new StudentLi("Priya", "Reddy", 3.6));
        map.put("Sneha", new StudentLi("Sneha", "Reddy", 3.9));
        map.put("Sahithi", new StudentLi("Sahithi", "Ravikanti", 3.8));
        System.out.println("Printing using keySet and Iterator:"); // KeySet & Iterator
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext())
        {
            String key = it.next();
            StudentLi stu = map.get(key);
            System.out.println("Key: " + key + "; Value: " + stu.constr());
        }
        System.out.println();
        System.out.println("Printing using forEach method:"); // For Each Method
        map.forEach((key, value) -> System.out.println("Key: " + key + "; Value: " + value.constr()));
        System.out.println();
        System.out.println("Printing using Entry Set:"); // Entry Set
        for (Map.Entry<String, StudentLi> entry: map.entrySet())
            System.out.println("Key: " + entry.getKey() + "; Value: " + entry.getValue().constr());
    }
}

