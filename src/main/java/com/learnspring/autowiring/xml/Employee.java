package com.learnspring.autowiring.xml;

public class Employee {
    EmployeeDetails employeeDetails;

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
        System.out.println("Setting value");
        this.employeeDetails = employeeDetails;
    }

    public Employee() {
    }

    public Employee(EmployeeDetails employeeDetails) {
        System.out.println("Constructor " +employeeDetails);
        this.employeeDetails = employeeDetails;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeDetails=" + employeeDetails +
                '}';
    }
}
