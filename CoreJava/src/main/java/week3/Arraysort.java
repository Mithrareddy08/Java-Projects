package week3;

import java.util.Comparator;
import java.util.stream.Stream;

public class Arraysort {


    public static void main(String[] args) {
        String[] strings = {"python", "java", "devops", "mules soft", "front end"};
        Stream<String> ss = Stream.of(strings);
        ss.sorted((a, b) -> a.length() - b.length())
                .sorted((a, b) -> {
                    if (a.length() == b.length())
                        return b.charAt(b.length() - 1) - a.charAt(a.length() - 1);
                    return 0;
                }).forEach(System.out::println);


    }
}