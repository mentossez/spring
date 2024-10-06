package com.learnspring.autowiring.annotation;

public class EmployeeDetails {
    private String name;
    private String epn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEpn() {
        return epn;
    }

    public void setEpn(String epn) {
        this.epn = epn;
    }

    public EmployeeDetails() {
    }

    public EmployeeDetails(String name, String epn) {
        this.name = name;
        this.epn = epn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", epn='" + epn + '\'' +
                '}';
    }
}
