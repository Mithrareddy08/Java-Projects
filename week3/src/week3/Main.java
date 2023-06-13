package week3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        MyExcep n=new MyExcep();
        n.Custom(s1);
    }
}