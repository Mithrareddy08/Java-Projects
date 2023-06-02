abstract class Department {
    public abstract int getDepartmentSize();
}

class subdepartment extends Department{
    private int departmentSize;
    public subdepartment(int size)
    {
        departmentSize = size;
    }
    public  int getDepartmentSize() {
        return departmentSize;
    }
}