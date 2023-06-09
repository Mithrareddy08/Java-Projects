import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        sc.close();

        String s[] = Str.split("\\s");
        String revString = "";

        for (int i = 0; i < s.length; i++) {
            String word = s[i];
            String revWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }
            revString = revString + revWord + " ";
        }
        System.out.print("Reversed string : " + revString);

    }
}