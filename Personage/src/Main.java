import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter age:");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age > 12 && age < 19) {
            System.out.println("teen");
        } else if (age < 13) {
            System.out.println("Kid");
        }else if (age > 19) {
            System.out.println("adult");
        }
    }
}