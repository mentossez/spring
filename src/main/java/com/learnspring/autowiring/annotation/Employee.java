package com.learnspring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
    You can use @Autowired annotation at property, settle and constructor
    @Qualifier is used specify the name of bean, in case there are multiple beans, used along with @Annotation
*/

public class Employee {
    @Autowired
    @Qualifier("employeeDetails2")
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
