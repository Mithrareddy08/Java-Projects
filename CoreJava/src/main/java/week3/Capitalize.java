package week3;
import java.util.Arrays;
import java.util.Comparator;

public class Capitalize {
    public static void main(String[] args) {
        String[] strings = {"python", "java", "devops", "mules soft", "front end"};

        String[] capitalizedStr = Arrays.stream(strings)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .toArray(String[]::new);
        Arrays.sort(capitalizedStr, Comparator.naturalOrder());
        Arrays.stream(capitalizedStr)
                .forEach(System.out::println);
    }
}
