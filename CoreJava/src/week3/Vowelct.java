package week3;

import java.util.Arrays;

public class Vowelct {
    public static void main(String[] args) {
        String[] strings = {"python", "java", "devops", "mules soft", "front end"};

        Arrays.stream(strings)
                .filter(s -> s.matches(".*[aeiouAEIOU].*"))
                .forEach(s -> System.out.println(s + " has " + count(s) + " vowels"));
    }

    private static int count(String st) {
        return st.replaceAll("(?i)[^aeiou]", "").length();
    }
}



