package com.learnspring.autowiring;

public class Employee {
    EmployeeDetails employeeDetails;

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
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
