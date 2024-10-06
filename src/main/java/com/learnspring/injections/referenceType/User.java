package com.learnspring.injections.referenceType;

public class User {
    private String name;
    private UserLoginDetails loginDetails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserLoginDetails getLoginDetails() {
        return loginDetails;
    }

    public void setLoginDetails(UserLoginDetails loginDetails) {
        this.loginDetails = loginDetails;
    }

    public User() {
    }

    public User(String name, UserLoginDetails loginDetails) {
        this.name = name;
        this.loginDetails = loginDetails;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", loginDetails=" + loginDetails +
                '}';
    }
}
