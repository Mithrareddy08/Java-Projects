package week4;
import java.util.*;
public class StudentList {
    private String firstName;
    private String lastName;
    private double gpa;
    public StudentList(String firstName,String lastName,double gpa){
        this.gpa=gpa;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public static void main(String args[]){
       ArrayList<StudentList> student = new ArrayList<>();
       student.add(new StudentList("Mithra","Reddy",2.6));
        student.add(new StudentList("Rash","Reddy",2));
        student.add(new StudentList("Sanjana","Reddy",3));
        student.add(new StudentList("Roshini","Racha",4));
        student.add(new StudentList("Rishika","Cheruku",3));
        double totalGPA = 0;
        for (StudentList s : student) {
            totalGPA += s.getGpa();
        }
        double avg = totalGPA / student.size();
        System.out.println("average is:"+avg);
        for (StudentList s : student) {
            if (s.getGpa() > avg) {
                System.out.println(s.getFirstName()+"  "+s.getLastName()+" "+s.getGpa());
            }
        }
    }
}
