package assignment_5;

public class Student {
    private String student_Name;
    private String student_Class;
    private int ID;

    public Student(String student_Name, String student_Class, int ID) {
        this.student_Name = student_Name;
        this.student_Class = student_Class;
        this.ID = ID;
    }

    public void printInfo() {
        System.out.println("Student: Name= " + student_Name
                + ", Class= " + student_Class
                + ", ID=" + ID);
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public String getStudent_Class() {
        return student_Class;
    }

    public void setStudent_Class(String student_Class) {
        this.student_Class = student_Class;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
