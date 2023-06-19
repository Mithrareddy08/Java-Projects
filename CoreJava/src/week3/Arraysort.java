package week3;

import java.util.Arrays;
import java.util.Comparator;

public class Arraysort  {
    public static void main(String[] args) {
        String[] strings = {"python", "java", "devops", "mules soft", "front end"};

        Arrays.sort(strings, Comparator.comparingInt(String::length)
                .thenComparing((st1, st2) -> {
                    if (st1.length() == st2.length()) {
                        return st2.charAt(st2.length() - 1) - st1.charAt(st1.length() - 1);
                    } else {
                        return 0;
                    }
                }));


        System.out.println(Arrays.toString(strings));
    }
}