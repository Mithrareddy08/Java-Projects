
import java.io.File;

import java.io.FileNotFoundException;
import java.util.*;

import static java.util.Arrays.*;



public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("C:\\Users\\Mithra Reddy\\Documents\\Student.csv"));

        String line;

        Student[] st = new Student[10];
        for(int i=0;s.hasNextLine();i++){
            line= s.nextLine();
            String[] str = line.split(",");
            String FirstName = str[0];
            String LastName = str[1];
            float gpa = Float.parseFloat(str[2]);
            st[i]= new Student(FirstName, LastName, gpa);

        }

        sort(st);

        for (int i=0;i<10;i++){
            System.out.println(st[i]);
        }

    }


    }
