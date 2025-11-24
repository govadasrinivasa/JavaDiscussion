package com.jt.utility;

import java.util.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + salary + ")";
    }
}

public class EmployeeGroupMap {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", "IT", 55000),
                new Employee(102, "Asha", "HR", 45000),
                new Employee(103, "Ravi", "IT", 60000),
                new Employee(104, "Priya", "Finance", 70000),
                new Employee(105, "Vinay", "HR", 48000)
        );

        // Map<Department, List<Employee>>
        Map<String, List<Employee>> deptMap = new HashMap<>();

        for (Employee emp : employees) {
            deptMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        // Display departments and employees
        System.out.println("Employees Grouped by Department:");
        for (String dept : deptMap.keySet()) {
            System.out.println("\n" + dept + ":");
            for (Employee e : deptMap.get(dept)) {
                System.out.println("  " + e);
            }
        }

        // show total employees and salary per department
        System.out.println("\nSummary:");
        for (String dept : deptMap.keySet()) {
            int count = deptMap.get(dept).size();
            double totalSalary = deptMap.get(dept).stream()
                    .mapToDouble(e -> e.salary)
                    .sum();

            System.out.println(dept + " -> Employees: " + count + ", Total Salary: " + totalSalary);
        }

    }
}
