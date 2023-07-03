package week4;

class StudentLi {
    String FirstName;
    String LastName;
    double GPA;
    StudentLi(String FirstName, String LastName, double GPA) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.GPA = GPA;
    }
    public String constr(){
        return "[FirstName = " + FirstName + ", LastName = " + LastName + ", GPA = " + GPA + "]";
    }
}
