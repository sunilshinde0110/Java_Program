package assignment_5;

import java.util.ArrayList;

public class Hostel {
    public static void main(String[] args) {
        var studentArrayList = new ArrayList<Student>();
        var student_01 = new Student("Nike", "Japanese", 1);
        var student_02 = new Student("Omi", "English", 2);
        var student_03 = new Student("Sunil", "Hindi", 3);

        studentArrayList.add(student_01);
        studentArrayList.add(student_02);
        studentArrayList.add(student_03);

        System.out.println("Number of Students= " + studentArrayList.size());

        student_01.printInfo();
    }
}
