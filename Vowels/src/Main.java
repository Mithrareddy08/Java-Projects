import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // String s ;
        int c =0;
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        st = st.toLowerCase();
        for (int i = 0;i<st.length();i++)
        {
            if(st.charAt(i) == 'a'|| st.charAt(i) == 'e' || st.charAt(i) == 'i'|| st.charAt(i) == 'o' || st.charAt(i) == 'u'){
              c++;
            }
        }
        System.out.println("Count: " +c);

    }
}