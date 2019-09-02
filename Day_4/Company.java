package assignment_7;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        var employee_01 = new Employee("Nike", "Designer", 1);
        var employee_02 = new Employee("Omi", "Master CS", 2);
        var employee_03 = new Employee("Sunil", "CS Employee", 3);
        var employee_04 = new Employee("Suraj", "Testing Engineer", 4);

        employeeArrayList.add(employee_01);
        employeeArrayList.add(employee_02);
        employeeArrayList.add(employee_03);
        employeeArrayList.add(employee_04);

        employeeArrayList.remove(employee_01);

        System.out.println("Number of Employees= " + employeeArrayList.size());
        employee_01.printInfo();

    }
}
