import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        Scanner st = new Scanner(System.in);
        String s2 = s.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() == s2.length())
        {
            char[] sa1 = s1.toCharArray();
            char[] sa2 = s2.toCharArray();
            Arrays.sort(sa1);
            Arrays.sort(sa2);
            boolean r = Arrays.equals(sa1,sa2);
            if(r){
                System.out.println(s1 + " & "+ s2+ " are Anagrams.");
            }else{
                System.out.println(s1 + " & "+ s2+ " are not Anagrams.");
            }
        }
    }
}