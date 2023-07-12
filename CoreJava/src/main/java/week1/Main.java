package week1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mithra");
        String newName = sc.nextLine();
        s.setName(newName);
        System.out.println("" + s.getName());


        impClass obj = new impClass();
        obj.print();
        obj.show();
    }
}