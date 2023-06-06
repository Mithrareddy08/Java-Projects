import java.util.Scanner;

public class Main {
    static void Age(int age) {

        if (age > 12 && age < 19) {
            System.out.println("teen");
        } else if (age < 13) {
            System.out.println("Kid");
        } else if (age > 19) {
            System.out.println("adult");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age:");
       int age = s.nextInt();
        Age(age);
    }
}