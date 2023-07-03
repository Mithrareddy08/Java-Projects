package week4;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateHashSet {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        HashSet<Character> Set= new HashSet();
        for(int i=0;i<s.length();i++){
            Set.add(s.charAt(i));
        }
        System.out.print(" The characters in the string are: ");
        Set.forEach(i->System.out.print(i));
    }}

